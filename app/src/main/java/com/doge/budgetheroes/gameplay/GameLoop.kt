class GameLoop(private val gameState: GameState) {
    private val random = Random()
    
    fun processCut(department: Department, amount: Double): CutResult {
        if (!isValidCut(department, amount)) {
            return CutResult(
                success = false,
                penalty = calculatePenalty(department, amount),
                message = "Invalid cut! This affects essential services."
            )
        }

        val baseMultiplier = calculateMultiplier()
        val artifactBonus = calculateArtifactBonus()
        val setBonus = calculateSetBonus()
        val socialBonus = calculateSocialBonus()
        
        val totalMultiplier = baseMultiplier * artifactBonus * setBonus * socialBonus
        val actualSavings = amount * totalMultiplier
        
        // Add research points based on savings
        gameState.researchPoints += actualSavings * 0.001
        
        // Social features
        if (actualSavings > gameState.dailyTarget) {
            broadcastAchievement()
            updateLeaderboard()
        }
        
        // Gacha currency rewards
        if (random.nextFloat() <= 0.05) {
            awardGachaCurrency()
        }
        
        gameState.currentSavings += actualSavings
        
        // 15% chance of generating a challenge
        if (random.nextFloat() <= 0.15) {
            generateChallenge()
        }
        
        // Check for achievements
        checkAchievements()
        
        return CutResult(
            success = true,
            savings = actualSavings,
            bonus = checkForBonus(),
            socialRewards = calculateSocialRewards()
        )
    }
    
    private fun calculateMultiplier(): Double {
        return gameState.engineers.sumOf { it.multiplier } * 
               gameState.activeBuffs.sumOf { it.multiplier }
    }
} 