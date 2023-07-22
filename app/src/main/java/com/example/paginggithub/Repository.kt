package com.example.paginggithub

import com.google.gson.annotations.SerializedName

data class RepositoriesResponse (
    @SerializedName("items")
    val repos:List<Repository>
)

data class Repository (
    @SerializedName("id")
    val id:String,
    @SerializedName("full_name")
    val fullName:String,
    @SerializedName("description")
    val description:String,
)
