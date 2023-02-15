package guri.projects.teamregistration

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "teamRegistration-table")
data class Team(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val teamName: String = "",
    @ColumnInfo(name = "teamMember1_name")
    val teamMember1_name: String = "",
    @ColumnInfo(name = "teamMember1_email")
    val teamMember1_email: String = "",
    @ColumnInfo(name = "teamMember2_name")
    val teamMember2_name: String = "",
    @ColumnInfo(name = "teamMember2_email")
    val teamMember2_email: String = "",
    @ColumnInfo(name = "teamMember3_name")
    val teamMember3_name: String = "",
    @ColumnInfo(name = "teamMember3_email")
    val teamMember3_email: String = "",
    @ColumnInfo(name = "teamMember4_name")
    val teamMember4_name: String = "",
    @ColumnInfo(name = "teamMember4_email")
    val teamMember4_email: String = "",
    @ColumnInfo(name = "teamMember5_name")
    val teamMember5_name: String = "",
    @ColumnInfo(name = "teamMember5_email")
    val teamMember5_email: String = "",
)
