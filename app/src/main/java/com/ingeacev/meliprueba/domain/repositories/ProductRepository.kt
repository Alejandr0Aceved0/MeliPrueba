package com.ingeacev.meliprueba.domain.repositories

import com.ingeacev.meliprueba.domain.model.Product
import com.ingeacev.meliprueba.domain.model.ProductDetails
import com.ingeacev.meliprueba.networking.Result
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    fun getProducts(description : String): Flow<Result<List<Product>>>

    fun getDefaultProducts(): Flow<Result<List<Product>>>

    suspend fun getProductDetail(id: Int): Result<ProductDetails>
}