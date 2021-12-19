package com.example.myspot

import kotlinx.coroutines.*
import kotlinx.coroutines.internal.synchronized

class ListStoragePark private constructor() {
    private val storage = mutableListOf<Park>()
    companion object{
        private var instance: ListStoragePark?=null

        @InternalCoroutinesApi
        fun getInstance():ListStoragePark{
            synchronized(this){
                if (instance == null){
                    instance = ListStoragePark()
                }
                return instance as ListStoragePark
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