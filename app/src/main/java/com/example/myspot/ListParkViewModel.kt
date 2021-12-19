package com.example.myspot

import androidx.lifecycle.ViewModel

class ListParkViewModel : ViewModel() {
    private val ListParkLogic = ListParkLogic()
    var display: String = ""
    private var listener: OnDisplayChanged?=null


    fun onClickSymbol(symbol:String):String{
        display = ListParkLogic.insertPark(display, symbol)
        return display
    }

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