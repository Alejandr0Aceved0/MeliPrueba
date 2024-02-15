package com.ingeacev.meliprueba.domain.model

import com.ingeacev.meliprueba.data.source.remote.dto.search_response.Shipping

data class Product(
    var title : String?,
    var price: Int?,
    var condition: String?,
    var image: String?,
    var shipping: Shipping?
)