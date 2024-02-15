package com.ingeacev.meliprueba.data.source.remote.dto

import com.ingeacev.meliprueba.data.source.remote.dto.search_response.Paging
import com.ingeacev.meliprueba.data.source.remote.dto.search_response.Result
import com.ingeacev.meliprueba.domain.model.Product

data class SearchResponseDto(
    var paging: Paging?,
    var results: List<Result?>?,
    var site_id: String?
)


fun SearchResponseDto.toProduct(): List<Product> {
    return results!!.map { result ->
        Product(
            title = result?.title,
            price = result?.price,
            condition = result?.condition,
            image = result?.thumbnail,
            shipping = result?.shipping
        )
    }
}