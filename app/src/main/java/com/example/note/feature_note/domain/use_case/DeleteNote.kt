package com.example.note.feature_note.domain.use_case

import com.example.note.feature_note.domain.repository.NoteRepository
import com.example.note.feature_note.domain.model.Note

class DeleteNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}