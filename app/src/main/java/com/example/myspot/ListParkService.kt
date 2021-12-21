package com.example.myspot

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ListParkService {
    @GET("/parking/lots")
    suspend fun parkLot(): Response<ListOfParkLots>
}