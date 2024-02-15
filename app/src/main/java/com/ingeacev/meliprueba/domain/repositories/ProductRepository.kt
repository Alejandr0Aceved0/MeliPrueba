package com.ingeacev.meliprueba.domain.repositories

import com.ingeacev.meliprueba.domain.model.Product
import com.ingeacev.meliprueba.domain.model.ProductDescription
import com.ingeacev.meliprueba.networking.Result
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun getProducts(description : String): Flow<Result<List<Product>>>

    fun getDefaultProducts(): Flow<Result<List<Product>>>

    suspend fun getProductDetails(itemId : String): Flow<Result<ProductDescription>>
}