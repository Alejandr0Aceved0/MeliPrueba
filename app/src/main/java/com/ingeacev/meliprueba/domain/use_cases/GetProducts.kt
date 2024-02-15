package com.ingeacev.meliprueba.domain.use_cases

import com.ingeacev.meliprueba.domain.model.Product
import com.ingeacev.meliprueba.domain.repositories.ProductRepository
import com.ingeacev.meliprueba.networking.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetProducts @Inject constructor(
    private val repository: ProductRepository
) {
    suspend operator fun invoke(description: String): Flow<Result<List<Product>>> {
        return repository.getProducts(description)
    }
}