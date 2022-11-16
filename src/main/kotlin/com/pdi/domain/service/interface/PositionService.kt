package com.pdi.domain.service.`interface`

import com.pdi.domain.entity.PositionEntity

interface PositionService {
    fun create(position: PositionEntity)
    fun findByName(name: String): PositionEntity
}