package com.example.myspot

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("/parking/lots")
    suspend fun parkLot(@Body body: ListOfParkLots): Response<ListOfParkLots>
}