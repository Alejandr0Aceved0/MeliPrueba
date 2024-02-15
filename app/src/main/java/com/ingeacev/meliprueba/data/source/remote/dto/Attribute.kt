package com.ingeacev.meliprueba.data.source.remote.dto

data class Attribute(
    var attribute_group_id: String?,
    var attribute_group_name: String?,
    var id: String?,
    var name: String?,
    var source: Long?,
    var value_id: String?,
    var value_name: String?,
    var value_struct: Any?,
    var values: List<Value?>?
)