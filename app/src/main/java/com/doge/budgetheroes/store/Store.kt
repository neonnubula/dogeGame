object Store {
    val purchaseableEngineers = listOf(
        Engineer("10x", "Efficiency Expert", 1.1, Specialization.PROCESS_OPTIMIZATION, 99.99),
        Engineer("100x", "Master Optimizer", 2.0, Specialization.PROCESS_OPTIMIZATION, 499.99),
        Engineer("1000x", "Legendary Reformer", 10.0, Specialization.PROCESS_OPTIMIZATION, 999.99)
    )
    
    val timeExtensions = listOf(
        TimeExtension("Evening Pass", 17, 21, 4.99),
        TimeExtension("Night Owl", 21, 24, 9.99),
        TimeExtension("Weekend Warriors", 0, 24, 19.99, isWeekend = true)
    )

    val battlePass = BattlePass(
        price = 999.99,
        duration = 30, // days
        rewards = listOf(
            PremiumReward(type = RewardType.ENGINEER, rarity = Rarity.LEGENDARY),
            PremiumReward(type = RewardType.DOGE_COINS, amount = 1000.0),
            PremiumReward(type = RewardType.ARTIFACT, rarity = Rarity.MYTHIC)
        )
    )

    val gacha = GachaSystem(
        pulls = listOf(
            GachaPull("Single Pull", 99.99),
            GachaPull("10x Pull", 899.99, bonus = "Guaranteed Epic+"),
            GachaPull("100x Pull", 7999.99, bonus = "Guaranteed Legendary")
        )
    )
    
    val specialBundles = listOf(
        Bundle("New Player", 4999.99, listOf(
            BundleItem.Engineer(rarity = Rarity.LEGENDARY),
            BundleItem.DogeCoin(amount = 5000.0),
            BundleItem.Artifact(rarity = Rarity.EPIC, count = 3)
        )),
        Bundle("Weekend Warrior", 2999.99, listOf(
            BundleItem.TimeExtension(duration = 48),
            BundleItem.Boost(multiplier = 5.0, duration = 48)
        ))
    )
}

data class TimeExtension(
    val name: String,
    val startHour: Int,
    val endHour: Int,
    val cost: Double,
    val isWeekend: Boolean = false
) 