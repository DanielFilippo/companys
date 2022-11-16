package com.pdi.controller.rest

import com.pdi.controller.rest.request.PositionRequest
import com.pdi.controller.rest.response.PositionResponse
import com.pdi.domain.extension.toPostion
import com.pdi.domain.extension.toResponse
import com.pdi.domain.service.`interface`.PositionService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("position")
class PositionController(
    val positionService: PositionService
) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid position: PositionRequest) {
        positionService.create(position.toPostion())
    }

    @GetMapping
    fun findByName(@RequestParam name: String): PositionResponse {
        return positionService.findByName(name).toResponse()
    }
}
