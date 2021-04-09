package edu.itesm.nytimes

import retrofit2.Response
import retrofit2.http.GET


interface APIService {
    @GET("hardcover-fiction.json?api-key=SxLtoFdIs5ti3gHRCFxmCX3pJAzZO8Wq")
    suspend fun getBooks() : Response<Results>
}