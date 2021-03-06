package com.samriddha.weatherforecastapp.ui.currentWeather

import androidx.lifecycle.*
import com.samriddha.weatherforecastapp.data.providers.UnitProvider
import com.samriddha.weatherforecastapp.data.repository.ForecastRepository
import com.samriddha.weatherforecastapp.ui.WeatherViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {


    val currentWeather = viewModelScope.async {
        forecastRepository.getCurrentWeather()
    }
}





