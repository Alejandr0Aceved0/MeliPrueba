package com.ingeacev.meliprueba.domain.model

import com.ingeacev.meliprueba.data.source.remote.dto.Shipping

data class Product(
    var title : String?,
    var price: Int?,
    var condition: String?,
    var image: String?,
    var shipping: Shipping?
)