package com.manoj;

import java.util.HashSet;
import java.util.Set;

public class Developer {
    private Integer id;
    private String name;
    private Set<String> book;

    public Developer(Integer id, String name, Set<String> book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }

    public Developer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getBook() {
        return book;
    }

    public void setBook(Set<String> book) {
        this.book = book;
    }

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
