data class GameState(
    val currentSavings: Double = 0.0,
    val dailyTarget: Double = 5479452055.0, // $2T / 365 days
    val engineers: MutableList<Engineer> = mutableListOf(),
    val activeBuffs: MutableList<Buff> = mutableListOf(),
    val gameTime: GameTime = GameTime(),
    val currency: Double = 0.0, // In-game currency for purchases
    val premiumCurrency: Double = 0.0, // New "DOGE Coins" premium currency
    val achievements: MutableList<Achievement> = mutableListOf(),
    val division: Division = Division.INTERN, // New progression system
    val researchPoints: Double = 0.0, // New research system
    val socialScore: Int = 0, // New social features
    val battlePass: BattlePass? = null, // Season pass system
    val artifacts: MutableList<Artifact> = mutableListOf(), // New collection system
    val alliance: Alliance? = null,
    val vipLevel: Int = 0,
    val seasonPass: SeasonPass? = null,
    val specialEvents: MutableList<Event> = mutableListOf(),
    val departments: MutableMap<Department, DepartmentProgress> = mutableMapOf(),
    val syntheticData: SyntheticGovernmentData = SyntheticGovernmentData(),
    val competitiveRank: CompetitiveRank = CompetitiveRank.BRONZE,
    val multiverse: MultiverseProgress = MultiverseProgress(), // Parallel universe mechanics
    val tradingPost: TradingPost = TradingPost(),
    val cityBuilder: CityBuilder = CityBuilder(), // New meta-game
    val memeCoins: MutableMap<MemeCoin, Double> = mutableMapOf(), // Real crypto integration
    val aiAdvisor: AIAdvisor = AIAdvisor(), // Powered by actual GPT-4
    val memePotential: MemePotential = MemePotential(), // Viral mechanics
    val controversyMeter: Double = 0.0, // Affects viral spread
    val twitterIntegration: TwitterBot = TwitterBot(), // Auto-posts achievements
    val metaversePresence: MetaverseState = MetaverseState() // VR/AR components
)

data class GameTime(
    val currentHour: Int = 9,
    val currentMinute: Int = 0,
    val isWorkHours: Boolean = true,
    val hasOvertimePass: Boolean = false
)

enum class Division {
    INTERN,
    ANALYST,
    SENIOR_ANALYST,
    MANAGER,
    DIRECTOR,
    DEPUTY_SECRETARY,
    SECRETARY,
    DOGE_MASTER
}

data class Alliance(
    val id: String,
    val name: String,
    val level: Int,
    val territory: MutableMap<String, TerritoryControl>,
    val allianceRaids: List<AllianceRaid>,
    val research: AllianceResearch
)

data class CityBuilder(
    val buildings: MutableMap<BuildingType, Building>,
    val population: Int,
    val satisfaction: Double,
    val resourceProduction: ResourceProduction
)

data class AIAdvisor(
    val personality: String = "Sarcastic Elon", // Changes daily
    val realTimeMarketData: Boolean = true,
    val predictiveBudgeting: Boolean = true,
    val memeGeneration: Boolean = true
)

data class SyntheticGovernmentData(
    val departments: List<SyntheticDepartment> = defaultDepartments(),
    val wastefulProjects: List<WastefulProject> = generateWastefulProjects(),
    val budgetItems: List<BudgetItem> = generateBudgetItems(),
    val inefficiencies: List<Inefficiency> = generateInefficiencies()
) {
    companion object {
        fun defaultDepartments() = listOf(
            SyntheticDepartment(
                name = "Department of Redundancy Department",
                budget = 50000000000.0,
                wastePercentage = 0.4,
                inefficiencyTypes = listOf("Duplicate Programs", "Excessive Meetings")
            ),
            SyntheticDepartment(
                name = "Bureau of Bureaucratic Paperwork",
                budget = 30000000000.0,
                wastePercentage = 0.35,
                inefficiencyTypes = listOf("Form Processing", "Red Tape Generation")
            ),
            // Add more synthetic departments...
        )

        fun generateWastefulProjects() = listOf(
            WastefulProject(
                name = "Study of Coffee Cup Aerodynamics",
                cost = 2000000.0,
                ridiculousnessLevel = 0.9
            ),
            WastefulProject(
                name = "Professional Pillow Fluffer Division",
                cost = 5000000.0,
                ridiculousnessLevel = 0.95
            )
            // Add more synthetic projects...
        )
    }
}

data class SyntheticDepartment(
    val name: String,
    val budget: Double,
    val wastePercentage: Double,
    val inefficiencyTypes: List<String>
)

data class WastefulProject(
    val name: String,
    val cost: Double,
    val ridiculousnessLevel: Double
) 