class PricingSystem {
    // Core Premium Currency - Engineering career progression
    val dogeCoinPacks = listOf(
        CurrencyPack("Intern Pack", 500.0, 0.99),
        CurrencyPack("Junior Engineer Pack", 2500.0, 4.99),
        CurrencyPack("10x Engineer Pack", 6000.0, 9.99),
        CurrencyPack("100x Engineer Pack", 15000.0, 19.99),
        CurrencyPack("DOGE Master Pack", 50000.0, 49.99)
    )

    // Battle Pass - Engineering themed
    val seasonalPasses = listOf(
        Pass(
            name = "Code Review Pass",
            price = 4.99,
            duration = 30,
            rewards = standardRewards,
            instantUnlocks = listOf("Junior Engineer", "Basic Efficiency Tools")
        ),
        Pass(
            name = "10x Engineer Pass",
            price = 9.99,
            duration = 30,
            rewards = premiumRewards,
            instantUnlocks = listOf("10x Engineer", "Premium Efficiency Suite", "1000 DOGE Coins")
        )
    )

    // Gacha System - Engineering recruitment
    val recruitmentPacks = listOf(
        GachaPull(
            name = "Intern Hire",
            price = 0.99,
            guaranteedRarity = Rarity.RARE
        ),
        GachaPull(
            name = "Engineering Team Hire",
            price = 3.99,
            guaranteedRarity = Rarity.RARE,
            bonus = "One Guaranteed 10x Engineer"
        ),
        GachaPull(
            name = "Department Expansion",
            price = 9.99,
            guaranteedRarity = Rarity.EPIC,
            bonus = "One Guaranteed 100x Engineer"
        )
    )

    // Starter Bundles - Engineering career path
    val bundles = listOf(
        Bundle(
            name = "New Hire Package",
            price = 0.99,
            value = 9.99,
            contents = listOf(
                "Junior Engineer",
                "500 DOGE Coins",
                "24h Productivity Boost"
            ),
            limitedTime = "First 48 hours only!"
        ),
        Bundle(
            name = "10x Performance Pack",
            price = 4.99,
            value = 29.99,
            contents = listOf(
                "10x Engineer",
                "2500 DOGE Coins",
                "7-Day Efficiency Boost",
                "Basic Optimization Tools"
            ),
            recurring = true
        ),
        Bundle(
            name = "100x Engineer Bundle",
            price = 19.99,
            value = 99.99,
            contents = listOf(
                "Guaranteed 100x Engineer",
                "10000 DOGE Coins",
                "30-Day Super Optimization",
                "Premium Efficiency Suite"
            ),
            recurring = true
        )
    )

    // Time Savers - Silicon Valley style
    val timeBoosts = listOf(
        TimeBoost("Coffee Break", 0.49, duration = 30),
        TimeBoost("Stand-up Meeting", 0.99, duration = 60),
        TimeBoost("Sprint Boost", 1.99, duration = 120),
        TimeBoost("Hackathon Mode", 3.99, duration = 480)
    )

    // VIP System - Engineering levels
    val vipSubscriptions = listOf(
        VIPSubscription(
            tier = "10x Engineer Status",
            price = 2.99,
            monthlyBenefits = listOf(
                "Daily Engineer Recruitment",
                "10% Efficiency Boost",
                "Basic Optimization Tools"
            )
        ),
        VIPSubscription(
            tier = "100x Engineer Status",
            price = 9.99,
            monthlyBenefits = listOf(
                "3x Daily Recruitments",
                "25% Efficiency Boost",
                "Premium Optimization Suite",
                "Weekly 10x Engineer"
            )
        )
    )

    // Daily Deals - Tech culture themed
    val dailyDeals = listOf(
        DailyDeal(
            name = "Standup Special",
            price = 0.99,
            value = 4.99,
            contents = listOf(
                "1-Hour Productivity Boost",
                "300 DOGE Coins",
                "Random Junior+ Engineer"
            ),
            limit = "Once per day"
        ),
        DailyDeal(
            name = "Sprint Finish",
            price = 1.99,
            value = 9.99,
            contents = listOf(
                "2-Hour Super Optimization",
                "800 DOGE Coins",
                "Guaranteed 10x Engineer"
            ),
            limit = "Once per day"
        )
    )

    // First Purchase Rewards
    val firstPurchaseBonus = FirstTimeBonus(
        minSpend = 0.99,
        rewards = listOf(
            "10x Engineer",
            "2000 DOGE Coins",
            "24h 100x Status",
            "Premium Optimization Pack"
        )
    )
} 