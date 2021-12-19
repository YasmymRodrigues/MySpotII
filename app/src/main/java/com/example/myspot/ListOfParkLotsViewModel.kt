package com.example.myspot

import androidx.lifecycle.ViewModel

const val ENDPOINT = "https://emel.city-platform.com/opendata/"
class ListOfParkLotsViewModel():ViewModel() {

    private val authLogic = AuthLogic(RetrofitBuilder.getInstance(ENDPOINT))
}