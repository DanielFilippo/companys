package com.pdi.domain.extension

import com.pdi.controller.rest.request.PositionRequest
import com.pdi.controller.rest.response.PositionResponse
import com.pdi.domain.entity.PositionEntity

fun PositionRequest.toPostion(): PositionEntity {
    return PositionEntity(name = this.name, description = this.description)
}

fun PositionEntity.toResponse(): PositionResponse {
    return PositionResponse(
        id = this.id,
        name = this.name,
        description = this.description
    )
}