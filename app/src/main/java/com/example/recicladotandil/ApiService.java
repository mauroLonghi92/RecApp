package com.example.recicladotandil;

import com.example.recicladotandil.Entidades.TotalRecycleModel;
import com.example.recicladotandil.Entidades.Usuario;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

interface ApiService {

    @GET("/total")
    Call<TotalRecycleModel> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);
    @POST("/total")
    Call<Usuario> addUser(@Path("id") Integer id);
    @GET("/api/users/")
    Call<TotalRecycleModel> editPostById(@Path("id")Integer id);

}
