package com.geovannycode

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class SpeakerService(val repo: SpeakerRepository) {
    fun getSpeaker(id: Long) = repo.findById(id)
    fun createSpeaker(speaker: Speaker) = repo.save(speaker)
    fun deleteSpeaker(id: Long) = repo.deleteById(id)
    fun getSpeakers(): List<Speaker> = repo.findAll().toList()
    fun updateSpeaker(id: Long, updatedSpeaker: Speaker): Speaker? {
        return if (repo.existsById(id)) {
            val speakerToUpdate = updatedSpeaker.copy(id = id)
            repo.save(speakerToUpdate)
        } else {
            null
        }
    }
}