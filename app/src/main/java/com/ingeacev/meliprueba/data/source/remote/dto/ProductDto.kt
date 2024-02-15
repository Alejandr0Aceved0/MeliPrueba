package com.ingeacev.meliprueba.data.source.remote.dto

import com.ingeacev.meliprueba.domain.model.ProductDetails

data class ProductDto(
    var title : String? = null,
    var price: Int? = null,
    var condition: String? = null,
    var image: String? = null,
    var shipping: Shipping? = null,
)

fun ProductDto.toProductDetails(): ProductDetails {
    return ProductDetails(
        title = title,
        price = price,
        condition = condition,
        image = image,
        shipping = shipping
    )
}