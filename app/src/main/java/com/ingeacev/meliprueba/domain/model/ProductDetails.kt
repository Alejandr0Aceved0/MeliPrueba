package com.ingeacev.meliprueba.domain.model

import com.ingeacev.meliprueba.data.source.remote.dto.Seller
import com.ingeacev.meliprueba.data.source.remote.dto.Shipping

data class ProductDetails(
    var title : String? = null,
    var seller: Seller? = null,
    var price: Int? = null,
    var available_quantity: Int? = null,
    var condition: String? = null,
    var image: String? = null,
    var shipping: Shipping? = null,
)