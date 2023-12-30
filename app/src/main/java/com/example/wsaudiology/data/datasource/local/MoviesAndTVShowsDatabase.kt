package com.example.wsaudiology.data.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.wsaudiology.data.datasource.local.moviesandtvshows.MoviesAndTVShowsDao
import com.example.wsaudiology.domain.model.moviesandtvshows.MoviesAndTVShowsResult

@Database(entities = [MoviesAndTVShowsResult::class], version = 2, exportSchema = false)
@TypeConverters(Converters::class)
abstract class MoviesAndTVShowsDatabase : RoomDatabase(){

    abstract fun moviesAndTVShowDao(): MoviesAndTVShowsDao
}