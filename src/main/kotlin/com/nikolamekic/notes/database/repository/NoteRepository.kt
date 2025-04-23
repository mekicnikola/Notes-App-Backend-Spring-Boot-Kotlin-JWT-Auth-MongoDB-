package com.nikolamekic.notes.database.repository

import com.nikolamekic.notes.database.model.Note
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface NoteRepository: MongoRepository<Note, ObjectId> {
    fun findByOwnerId(ownedId: ObjectId): List<Note>
}