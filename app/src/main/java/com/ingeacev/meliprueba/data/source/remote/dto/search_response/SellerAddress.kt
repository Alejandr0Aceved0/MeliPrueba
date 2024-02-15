package com.ingeacev.meliprueba.data.source.remote.dto.search_response

data class SellerAddress(
    var city: City?,
    var country: Country?,
    var latitude: String?,
    var longitude: String?,
    var state: State?
)