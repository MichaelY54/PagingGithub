package com.example.paginggithub

import retrofit2.http.GET

interface RepositoriesApiService {
    @GET("repositories?q=kotlin")
    suspend fun getRepositories():RepositoriesResponse
}
