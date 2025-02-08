class CityManagementSystem {
    val buildings = listOf(
        Building("Treasury", generates = Resource.DOGE_COINS),
        Building("Research Lab", generates = Resource.RESEARCH_POINTS),
        Building("Training Ground", generates = Resource.ENGINEER_EXP)
    )

    val cityEvents = listOf(
        CityEvent("Budget Crisis", difficulty = 5, rewards = CrisisRewards),
        CityEvent("Economic Boom", difficulty = 3, rewards = BoomRewards)
    )

    val tradingSystem = TradingSystem(
        realTimePrices = true,
        crossServerTrading = true,
        nftIntegration = true
    )
} 