class SuperViralSystem {
    val socialFeatures = SocialFeatures(
        // Make it impossible to resist sharing
        autoShareTriggers = listOf(
            ShareTrigger(
                condition = "Found waste over $1B",
                reward = "Ultra Rare Efficiency Token",
                memeTemplate = "money-printer-go-brrr.jpg",
                viralText = "I just saved taxpayers $1B! 🚀 #DOGEheroes"
            ),
            ShareTrigger(
                condition = "Discovered ridiculous purchase",
                reward = "Legendary Auditor Status",
                memeTemplate = "surprised-pikachu.jpg",
                viralText = "Government spent HOW MUCH on this!? 😱 #TaxpayerMoney"
            )
        ),
        
        // Competitive viral mechanics
        leaderboards = listOf(
            Leaderboard(
                name = "Daily Money Saved",
                reward = "Golden Auditor Badge",
                shareBonus = "2x Savings Multiplier"
            ),
            Leaderboard(
                name = "Most Ridiculous Find",
                reward = "Meme Lord Title",
                shareBonus = "Viral Boost Pack"
            )
        ),

        // Friend system with benefits
        referralSystem = ReferralSystem(
            initialBonus = "Rare Efficiency Engineer",
            friendBonus = "Premium Currency Pack",
            chainBonus = "Each friend who invites 5 friends gets Ultra Rare Item"
        )
    )

    val viralChallenges = listOf(
        Challenge(
            name = "Budget Exposed!",
            description = "Share 3 ridiculous government purchases",
            reward = "Viral Multiplier",
            chainReward = "Each share generates bonus rewards"
        ),
        Challenge(
            name = "Taxpayer Hero",
            description = "Save more money than your entire friend network combined",
            reward = "Legendary Status",
            viralEffect = "Friends get notification of your achievement"
        )
    )

    val memeFactory = MemeFactory(
        templates = listOf(
            MemeTemplate(
                name = "Government Spending Gone Wrong",
                virality = 0.8,
                shareability = 0.9,
                autoGenerate = true
            ),
            MemeTemplate(
                name = "Bureaucrat Logic",
                virality = 0.85,
                shareability = 0.95,
                autoGenerate = true
            )
        ),
        aiCaption = AICaption(
            style = "Extremely Viral",
            controversy = 0.7,
            humor = 0.9
        )
    )

    val viralEvents = listOf(
        ViralEvent(
            name = "Government Gone Wild Week",
            description = "Every shared discovery doubles in visibility",
            chainEffect = "Each share spawns mini-events for friends",
            rewardMultiplier = 3.0
        ),
        ViralEvent(
            name = "Meme Economy Boom",
            description = "All memes get 5x visibility boost",
            duration = "72 hours",
            viralityBoost = 5.0
        )
    )

    val contentCreatorProgram = ContentCreatorSystem(
        rewards = listOf(
            "Custom Meme Templates",
            "Early Access to Scandals",
            "Viral Boost Powers"
        ),
        requirements = "Must have shared content that reached 1000+ people",
        benefits = "Revenue share from referred players"
    )
} 