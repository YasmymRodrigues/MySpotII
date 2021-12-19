package com.example.myspot

import kotlinx.coroutines.*
import kotlinx.coroutines.internal.synchronized

class ListStorage private constructor() {
    private val storage = mutableListOf<Park>()
    companion object{
        private var instance: ListStorage?=null

        @InternalCoroutinesApi
        fun getInstance():ListStorage{
            synchronized(this){
                if (instance == null){
                    instance = ListStorage()
                }
                return instance as ListStorage
            }
        }
    }
    suspend fun insert(park: Park){
        CoroutineScope(Dispatchers.IO).launch {
            Thread.sleep(30000)
            storage.add(park)
        }
    }
    fun getAll(): List<Park>{
        return storage.toList()
    }
}