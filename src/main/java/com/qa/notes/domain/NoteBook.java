package com.qa.notes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NoteBook {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public NoteBook() {

    }

    public NoteBook(String name) {

    }

}
