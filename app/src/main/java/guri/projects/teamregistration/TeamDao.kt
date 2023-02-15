package guri.projects.teamregistration

import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import java.util.concurrent.Flow

interface TeamDao
{
    @Insert
    suspend fun insert(team: Team)

    @Query("SELECT *  FROM `team-table`")
    fun fetchAllTeams() : Flow<List<Team>>

    @Query("SELECT * FROM 'team-table' where id=:id")
    fun fetchTeamByID(id : Int) : Flow<Team>
}