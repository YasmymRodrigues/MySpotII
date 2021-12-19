package com.example.myspot

import com.example.myspot.repository.CarRepository
import kotlinx.coroutines.InternalCoroutinesApi

/*
class CarLogic(private val repository: CarRepository) {
}*/
class CarLogic {
    @InternalCoroutinesApi
    private val storage = ListStorageCar.getInstance()

    fun insertSymbol(display: String, symbol: String): String{
        return ""
    }
    //exemplo
    /*fun performOperation(expression: String): Double{
        val expressionBuilder = ExpressionBuilder(expression).build()
        val result = expressionBuilder.evaluate()
        storage.insert(Operation(expression, result)
        return result
   }*/


}