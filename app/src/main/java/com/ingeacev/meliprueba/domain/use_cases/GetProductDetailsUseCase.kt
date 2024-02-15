package com.ingeacev.meliprueba.domain.use_cases

import com.ingeacev.meliprueba.domain.model.ProductDescription
import com.ingeacev.meliprueba.domain.repositories.ProductRepository
import com.ingeacev.meliprueba.networking.Result
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GetProductDetailsUseCase @Inject constructor(
    private val repository: ProductRepository
) {
    suspend operator fun invoke(itemId: String): Flow<Result<ProductDescription>> {
        return repository.getProductDetails(itemId)
    }
}