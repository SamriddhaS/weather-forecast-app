package com.example.weatherforecastapp.ui.futureWeather

import androidx.room.ColumnInfo
import com.example.weatherforecastapp.pojo.Weather

data class SimpleFutureWeatherDataImpl(
    @ColumnInfo(name = "date")
    override val date: Long,

    @ColumnInfo(name = "weatherInfo_temp")
    override val temp: Double,

    @ColumnInfo(name = "weatherDescription")
    override val weatherDescription: List<Weather>
) : SimpleFutureWeatherData