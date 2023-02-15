package guri.projects.teamregistration

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Team::class], version = 1)
abstract class TeamDatabase : RoomDatabase()
{
    abstract fun TeaamDao() : TeamDao

    companion object {

        @Volatile
        private var INSTANCE : TeamDatabase? = null

        fun getInstance(context : Context) : TeamDatabase{


            synchronized(this)
            {
                var instance = INSTANCE

                if(instance == null)
                {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        TeamDatabase::class.java,
                        "team_database"
                    ).fallbackToDestructiveMigration()
                        .build()


                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}