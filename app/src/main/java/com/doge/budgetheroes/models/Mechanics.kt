data class Engineer(
    val id: String,
    val name: String,
    val multiplier: Double,
    val specialization: Specialization,
    val cost: Double? = null,
    val rarity: Rarity,
    val skills: List<Skill>,
    val level: Int = 1,
    val experience: Double = 0.0
)

enum class Specialization {
    FRAUD_DETECTION,
    PROCESS_OPTIMIZATION,
    TECHNOLOGY_MODERNIZATION,
    PROCUREMENT_SPECIALIST
}

data class Buff(
    val type: BuffType,
    val multiplier: Double,
    val duration: Int // in seconds
)

enum class BuffType {
    FRAUD_BONUS,
    INSPIRATION,
    COFFEE_BOOST,
    WEEKEND_WARRIOR
}

enum class Rarity {
    COMMON,
    RARE,
    EPIC,
    LEGENDARY,
    MYTHIC
}

data class Skill(
    val type: SkillType,
    val level: Int,
    val cooldown: Int
)

enum class SkillType {
    BUDGET_SLASH,
    PROCESS_OPTIMIZATION,
    FRAUD_DETECTION,
    TEAM_INSPIRATION,
    OVERTIME_BOOST,
    EMERGENCY_POWERS
}

data class Artifact(
    val id: String,
    val name: String,
    val rarity: Rarity,
    val bonus: ArtifactBonus,
    val set: ArtifactSet?
) 