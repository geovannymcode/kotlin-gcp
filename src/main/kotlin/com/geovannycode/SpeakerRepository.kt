package com.geovannycode

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SpeakerRepository : CrudRepository<Speaker, Long> {
}