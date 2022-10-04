package com.leapworx.notemaker.domain;

import java.util.Date;

public class Note {
    private int noteID;
    private String noteHeading;
    private Date lastModifiedDate;
    private Date createdDate;
    private int topicID;
    private String noteContent;

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    public int getNoteID() {
        return noteID;
    }

    public void setNoteID(int noteID) {
        this.noteID = noteID;
    }

    public String getNoteHeading() {
        return noteHeading;
    }

    public void setNoteHeading(String noteHeading) {
        this.noteHeading = noteHeading;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getTopicID() {
        return topicID;
    }

    public void setTopicID(int topicID) {
        this.topicID = topicID;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteID=" + noteID +
                ", noteHeading='" + noteHeading + '\'' +
                ", lastModifiedDate=" + lastModifiedDate +
                ", createdDate=" + createdDate +
                ", topicID=" + topicID +
                '}';
    }
}
