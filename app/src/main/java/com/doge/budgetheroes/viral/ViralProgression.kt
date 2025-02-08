class ViralProgression {
    val viralMilestones = listOf(
        ViralMilestone(
            requirement = "Content shared 100 times",
            reward = "Viral Marketing Expert Title",
            unlocks = "Custom Meme Creation Tools"
        ),
        ViralMilestone(
            requirement = "1000 friend referrals",
            reward = "Legendary Influencer Status",
            unlocks = "Personal Meme Economy"
        )
    )

    val shareStreaks = ShareStreakSystem(
        dailyBonus = "Increasing rewards for consecutive days of sharing",
        weeklyBonus = "Mega Viral Boost for 7-day streaks",
        monthlyBonus = "Ultra Rare Item + Viral Multiplier"
    )

    val viralChallenges = TimedChallengeSystem(
        hourly = "Quick share challenges",
        daily = "Major viral events",
        weekly = "Massive network challenges",
        rewards = "Exponentially increasing based on participation"
    )
} 