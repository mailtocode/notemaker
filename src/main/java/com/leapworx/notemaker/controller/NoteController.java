package com.leapworx.notemaker.controller;

import com.leapworx.notemaker.domain.Note;
import com.leapworx.notemaker.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/notemaker")
public class NoteController {

    @Autowired
    private ContentService contentService;

    @GetMapping("notes/{noteID}")
    public List<Note> getListOfNotes(@PathVariable Integer noteID)
    throws Exception
    {
        List<Note> result = new ArrayList<>();

        Note note = new Note();
        note.setNoteID(noteID);
        note.setNoteHeading("Test Note");
        note.setCreatedDate(Calendar.getInstance().getTime());
        note.setLastModifiedDate(Calendar.getInstance().getTime());
        note.setTopicID(1);

        note.setNoteContent(contentService.getNoteContent(noteID));

        result.add(note);

        return result;
    }
}
