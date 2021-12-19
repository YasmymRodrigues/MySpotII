package com.example.myspot

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

//Do not process data
class CarViewModel(application: Application) : AndroidViewModel(application) {
        //private val CarLogic = CarLogic()
        private var listener: OnDisplayChanged? =  null
        var display: String = ""
        private val storage = CarDatabase.getInstance(application).carDao()
        private val carLogic = CarLogic(storage)


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
        //display = CarLogic.insertSymbol(display, symbol)
        notifyOnDisplayChanged()
        return display
    }
}