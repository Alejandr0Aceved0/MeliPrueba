package com.ingeacev.meliprueba.data.source.remote.dto.search_response

data class Paging(
    var limit: Int?,
    var offset: Int?,
    var primary_results: Int?,
    var total: Int?
)