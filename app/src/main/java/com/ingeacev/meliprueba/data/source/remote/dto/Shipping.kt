package com.ingeacev.meliprueba.data.source.remote.dto

data class Shipping(
    var free_shipping: Boolean?,
    var logistic_type: String?,
    var mode: String?,
    var store_pick_up: Boolean?,
    var tags: List<String?>?
)