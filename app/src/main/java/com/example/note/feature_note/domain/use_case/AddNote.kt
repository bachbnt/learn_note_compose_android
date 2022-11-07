package com.example.note.feature_note.domain.use_case

import com.example.note.feature_note.domain.repository.NoteRepository
import com.example.note.feature_note.domain.model.InvalidNoteException
import com.example.note.feature_note.domain.model.Note

class AddNote(private val repository: NoteRepository) {

    @kotlin.jvm.Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty")
        }
        repository.insertNote(note)
    }
}