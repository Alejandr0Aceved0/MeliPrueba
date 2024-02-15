package com.ingeacev.meliprueba.data.source.remote.dto

import com.ingeacev.meliprueba.domain.model.Product
import com.ingeacev.meliprueba.domain.model.ProductDescription

data class ProductDescriptionDto(
    val text: String?,
    val plain_text: String?,
    val last_updated: String?,
    val date_created: String?,
    val snapshot: String?,
)


fun ProductDescriptionDto.toProductDescription(): ProductDescription {
    return ProductDescription(
        text = text,
        plain_text = plain_text,
        last_updated = last_updated,
        date_created = date_created,
        snapshot = snapshot
    )
}
