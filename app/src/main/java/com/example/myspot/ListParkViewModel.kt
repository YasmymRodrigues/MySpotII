package com.example.myspot

import androidx.lifecycle.ViewModel
import com.example.myspot.repository.ParkRepository
import kotlinx.coroutines.InternalCoroutinesApi

const val ENDPOINT = "https://emel.city-platform.com/opendata/"

class ListParkViewModel : ViewModel() {
    private val parkRepository = ParkRepository()
    private val listParkLogic = ListParkLogic(parkRepository)
    private val wsLogic = ListParkWSLogic(RetrofitBuilder.getInstance(ENDPOINT))

   @InternalCoroutinesApi
   fun getAll(): List<Park>{
        return listParkLogic.getParks()
    }

   /* private fun notifyOnDisplayChanged(){
        listener?.onDisplayChanged(display)
    }

    fun registerListener(listener: ListParkFragment){
        this.listener = listener
        listener?.onDisplayChanged(display)
    }

    fun unregisterListener(){
        listener = null
    }*/







}