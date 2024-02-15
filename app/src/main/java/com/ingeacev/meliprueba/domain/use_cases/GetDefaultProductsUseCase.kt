package com.ingeacev.meliprueba.domain.use_cases

import com.ingeacev.meliprueba.domain.model.Product
import com.ingeacev.meliprueba.domain.repositories.ProductRepository
import com.ingeacev.meliprueba.networking.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDefaultProductsUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    suspend operator fun invoke(): Flow<Result<List<Product>>> {
        return repository.getDefaultProducts()
    }
}