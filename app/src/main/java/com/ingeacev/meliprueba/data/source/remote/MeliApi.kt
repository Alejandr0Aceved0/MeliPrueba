package com.ingeacev.meliprueba.data.source.remote

import com.ingeacev.meliprueba.data.source.remote.dto.DescriptionDto
import com.ingeacev.meliprueba.data.source.remote.dto.SearchResponseDto
import retrofit2.http.GET
import retrofit2.http.Path

interface MeliApi {

    @GET("MLA/search?q={description)") //TODO: AGREGAR REEMPLAZO DE ESPACIOS EN BLANCO POR %(PORCENTAJE)
    suspend fun searchItems(
        @Path("description") description: String
    ): SearchResponseDto

    @GET("MLA/search?q=Motorola%20G6")
    suspend fun searchItemsDefault(): SearchResponseDto


    @GET("/items/{item_id}/description")
    suspend fun descriptionItem(
        @Path("item_id") itemId : String
    ): DescriptionDto
}