package com.example.myspot

import androidx.lifecycle.ViewModel
import com.example.myspot.repository.ParkRepository

class ListParkViewModel : ViewModel() {
    private val parkRepository = ParkRepository()
    private val ListParkLogic = ListParkLogic(parkRepository)
    var display: String = ""
    private var listener: OnDisplayChanged?=null


   /* fun onClickSymbol(symbol:String):String{
        display = ListParkLogic.insertPark(display, symbol)
        return display
    }*/

    private fun notifyOnDisplayChanged(){
        listener?.onDisplayChanged(display)
    }

    fun registerListener(listener: OnDisplayChanged){
        this.listener = listener
        listener?.onDisplayChanged(display)
    }

    fun unregisterListener(){
        listener = null
    }

    /*fun onClickSymbol(symbol: String){
        display = ListParkLogic.onClickSymbol(display, symbol)
        notifyOnDisplayChanged()
    }*/

}