@Database(entities = [GameProgress::class], version = 1)
abstract class GameDatabase : RoomDatabase() {
    abstract fun gameProgressDao(): GameProgressDao
}

@Entity
data class GameProgress(
    @PrimaryKey val id: Int = 1,
    val savingsAmount: Double,
    val engineersJson: String,
    val buffsJson: String,
    val achievementsJson: String,
    val currency: Double
) 