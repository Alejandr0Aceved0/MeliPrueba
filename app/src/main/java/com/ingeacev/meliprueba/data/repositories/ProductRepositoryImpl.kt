package com.ingeacev.meliprueba.data.repositories

import com.ingeacev.meliprueba.data.source.remote.MeliApi
import com.ingeacev.meliprueba.data.source.remote.dto.toProduct
import com.ingeacev.meliprueba.data.source.remote.dto.toProductDescription
import com.ingeacev.meliprueba.domain.model.Product
import com.ingeacev.meliprueba.domain.model.ProductDescription
import com.ingeacev.meliprueba.domain.model.ProductDetails
import com.ingeacev.meliprueba.domain.repositories.ProductRepository
import com.ingeacev.meliprueba.networking.Result
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val meliApi: MeliApi
) : ProductRepository {

    override fun getProducts(description: String): Flow<Result<List<Product>>> = flow {
        emit(Result.Loading())
        try {
            val response = meliApi.searchItems(description).toProduct()
            emit(Result.Success(response))
        } catch (e: HttpException) {
            emit(
                Result.Error(
                    message = "Ah ocurrido un error",
                    data = null
                )
            )
        } catch (e: IOException) {
            emit(
                Result.Error(
                    message = "No se encuentra conexion con el servidor, revisa tu conexion",
                    data = null
                )
            )
        }
    }

    override fun getDefaultProducts(): Flow<Result<List<Product>>> = flow {
        emit(Result.Loading())
        try {
            val response = meliApi.searchItemsDefault().toProduct()
            emit(Result.Success(response))
        } catch (e: HttpException) {
            emit(
                Result.Error(
                    message = "Ah ocurrido un error",
                    data = null
                )
            )
        } catch (e: IOException) {
            emit(
                Result.Error(
                    message = "No se encuentra conexion con el servidor, revisa tu conexion",
                    data = null
                )
            )
        }
    }

    override suspend fun getProductDetails(itemId: String): Flow<Result<ProductDescription>> = flow {
        emit(Result.Loading())
        try {
            val response = meliApi.descriptionItem(itemId).toProductDescription()
            emit(Result.Success(response))
        } catch (e: HttpException) {
            emit(
                Result.Error(
                    message = "Ah ocurrido un error",
                    data = null
                )
            )
        } catch (e: IOException) {
            emit(
                Result.Error(
                    message = "No se encuentra conexion con el servidor, revisa tu conexion",
                    data = null
                )
            )
        }
    }
}