package com.samriddha.weatherforecastapp.pojo


import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class Main(
    @SerializedName("feels_like")
    val feelsLike: Double,
    val humidity: Double,
    val pressure: Double,
    val temp: Double,
    @SerializedName("temp_max")
    val tempMax: Double,
    @SerializedName("temp_min")
    val tempMin: Double
)