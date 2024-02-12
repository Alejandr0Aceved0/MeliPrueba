package com.ingeacev.core.data.model

/**
 * Created by Alejandro Acevedo on 11/02/2024.
 */
sealed class Resource <T>(
    var data: T? = null,
    val errorCode: Int? = null,
    val errorMessage: String? = null
) {
    class Sleep<T>(data: T? = null) : Resource<T>(data)
    class Success<T>(data: T? = null) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class GenericDataError<T>(errorCode: Int? = null, errorMessage: String? = null) :
        Resource<T>(null, errorCode, errorMessage)

    override fun toString(): String {
        return when (this) {
            is Sleep-> "Sleep"
            is Success<*> -> "Success[data=$data]"
            is Loading<T> -> "Loading"
            is GenericDataError -> "Error[exception=$errorCode]"
        }
    }
}