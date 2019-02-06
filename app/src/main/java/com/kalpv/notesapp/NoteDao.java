package com.kalpv.notesapp;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

public interface NoteDao {

    @Insert
    void insert(Note note);

    @Delete
    void delete(Note note);

    @Update
    void update(Note note);

    @Query("DELETE FROM NOTES_TABLE")
    void deleteAllNotes();

    @Query("SELECT * FROM NOTES_TABLE ORDER BY priority")
    LiveData<List<Note>> getAllNotes();
}
