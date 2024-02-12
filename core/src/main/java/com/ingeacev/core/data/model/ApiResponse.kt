package com.ingeacev.core.data.model

/**
 * Created by Alejandro Acevedo on 11/02/2024.
 */
sealed class ApiResponse <out Data>

data class SuccessApiResponse<out Data>(val body: Data) : ApiResponse<Data>()

data class GenericErrorApiResponse(val code: Int? = -1, val message: String? = "") :
    ApiResponse<Nothing>()