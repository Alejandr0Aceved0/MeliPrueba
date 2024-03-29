package com.ingeacev.meliprueba.data.source.remote.dto

data class Result(
    var accepts_mercadopago: Boolean?,
    var address: Address?,
    var attributes: List<Attribute?>?,
    var available_quantity: Int?,
    var buying_mode: String?,
    var catalog_listing: Boolean?,
    var catalog_product_id: String?,
    var category_id: String?,
    var condition: String?,
    var currency_id: String?,
    var differential_pricing: DifferentialPricing?,
    var id: String?,
    var installments: Installments?,
    var listing_type_id: String?,
    var official_store_id: Any?,
    var original_price: Any?,
    var permalink: String?,
    var price: Int?,
    var seller: Seller?,
    var seller_address: SellerAddress?,
    var shipping: Shipping?,
    var site_id: String?,
    var stop_time: String?,
    var tags: List<String?>?,
    var thumbnail: String?,
    var title: String?
)