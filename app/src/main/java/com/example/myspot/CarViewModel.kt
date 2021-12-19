package com.example.myspot

import androidx.lifecycle.ViewModel

//Do not process data
class CarViewModel : ViewModel() {
        private val CarLogic = CarLogic()
        private var listener: OnDisplayChanged? =  null
        var display: String = ""


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
    fun onClickSymbol(symbol:String) : String {
        display = CarLogic.insertSymbol(display, symbol)
        notifyOnDisplayChanged()
        return display
    }
}