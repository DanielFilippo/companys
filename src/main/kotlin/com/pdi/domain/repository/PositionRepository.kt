package com.pdi.domain.repository

import com.pdi.domain.entity.PositionEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PositionRepository: JpaRepository<PositionEntity, Int> {
    fun findByName(name: String): PositionEntity
}