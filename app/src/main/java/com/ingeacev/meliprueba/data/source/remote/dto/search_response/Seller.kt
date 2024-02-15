package com.ingeacev.meliprueba.data.source.remote.dto.search_response

data class Seller(
    var car_dealer: Boolean?,
    var id: Int?,
    var nickname: String?,
    var power_seller_status: Any?,
    var real_estate_agency: Boolean?,
    var tags: List<Any?>?
)