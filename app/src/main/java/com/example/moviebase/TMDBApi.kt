package com.example.moviebase



import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBApi {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key")
        apiKey: String = "62c10acc64aa3bd06c3ee9ac146ae91a",
        @Query("page")
        page: Int
    ): Call<MoviesResponse>


    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key")
        apiKey: String = "62c10acc64aa3bd06c3ee9ac146ae91a",
        @Query("page")
        page: Int
    ): Call<MoviesResponse>


    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key")
        apiKey: String = "62c10acc64aa3bd06c3ee9ac146ae91a",
        @Query("page")
        page: Int
    ): Call<MoviesResponse>
}