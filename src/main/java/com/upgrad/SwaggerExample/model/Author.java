package com.upgrad.SwaggerExample.model;

// POJO -> Plain Old Java Object
public class Author {
    private long authorId;
    private String authorName;

    // Default Constructor
    public Author() {
        System.out.println("*** Author Constructor ***");
    }

    // Parameterized Constructor
    public Author(long authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    // Getters and Setters
    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
