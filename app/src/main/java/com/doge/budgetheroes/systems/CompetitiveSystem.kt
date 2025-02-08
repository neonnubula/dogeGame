class CompetitiveSystem {
    val crossServerBattles = CrossServerBattle(
        seasons = 3,
        rewards = mapOf(
            "Champion" to Reward(dogeCoin = 100000.0, exclusiveTitle = true),
            "Top 10" to Reward(dogeCoin = 50000.0, exclusiveSkin = true)
        )
    )

    val allianceWars = AllianceWarSystem(
        territories = 100,
        resourceNodes = 1000,
        specialBuildings = 50,
        matchmaking = SkillBasedMatchmaking()
    )

    val multiverse = MultiverseSystem(
        parallelUniverses = 10,
        crossUniverseTrading = true,
        multiverseRaids = true
    )
} 