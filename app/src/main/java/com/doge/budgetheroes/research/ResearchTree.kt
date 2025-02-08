class ResearchTree {
    val nodes = listOf(
        ResearchNode("Advanced Analytics", 1000.0, effects = listOf(
            ResearchEffect.MULTIPLIER_BOOST(0.1),
            ResearchEffect.UNLOCK_DEPARTMENT("AI Division")
        )),
        ResearchNode("Quantum Computing", 5000.0, effects = listOf(
            ResearchEffect.NEW_ENGINEER_TYPE("Quantum Engineer"),
            ResearchEffect.UNLOCK_SPECIAL_MISSIONS
        )),
        ResearchNode("Time Management", 2000.0, effects = listOf(
            ResearchEffect.EXTENDED_HOURS(2),
            ResearchEffect.OVERTIME_EFFICIENCY(0.2)
        ))
    )
} 