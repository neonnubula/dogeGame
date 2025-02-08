class MonetizationSystem {
    val vipSystem = VIPSystem(
        levels = listOf(
            VIPLevel(1, cost = 999.99, benefits = listOf(
                "10% Extra Savings",
                "1 Free Daily Pull",
                "Extra Research Slot"
            )),
            // ... up to VIP 100
        )
    )

    val seasonPass = SeasonPass(
        standardPass = Pass(price = 999.99, rewards = standardRewards),
        premiumPass = Pass(price = 2999.99, rewards = premiumRewards),
        ultraPass = Pass(price = 9999.99, rewards = ultraRewards)
    )

    val subscriptions = listOf(
        Subscription("Budget Master", 49.99, Period.MONTHLY),
        Subscription("Department Chief", 99.99, Period.MONTHLY),
        Subscription("DOGE Director", 299.99, Period.MONTHLY)
    )

    val limitedTimeOffers = DynamicOfferSystem(
        personalizedOffers = true,
        aiPricingOptimization = true,
        scarcityMechanics = true
    )
} 