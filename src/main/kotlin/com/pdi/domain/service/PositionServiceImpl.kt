package com.pdi.domain.service

import com.pdi.domain.service.`interface`.PositionService
import com.pdi.domain.entity.PositionEntity
import com.pdi.domain.repository.PositionRepository
import org.springframework.stereotype.Service

@Service
class PositionServiceImpl(
    private val positionRepository: PositionRepository
): PositionService {
    override fun create(position: PositionEntity) {
        positionRepository.save(position)
    }

    override fun findByName(name: String): PositionEntity {
        return positionRepository.findByName(name)
    }
}