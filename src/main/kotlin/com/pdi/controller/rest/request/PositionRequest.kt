package com.pdi.controller.rest.request

import javax.validation.constraints.NotEmpty

data class PositionRequest (
    @field:NotEmpty(message = "Name deve ser informado!")
    var name: String,

    @field:NotEmpty(message = "Description deve ser informado!")
    var description: String
)