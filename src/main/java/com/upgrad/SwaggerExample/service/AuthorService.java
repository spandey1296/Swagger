package com.upgrad.SwaggerExample.service;

import com.upgrad.SwaggerExample.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorService {

    // Singleton
    public static ArrayList<Author> AUTHOR = new ArrayList<>();

    static {
        Author author1 = new Author();
        author1.setAuthorId(1L);
        author1.setAuthorName("Ruskin Bond");

        Author author2 = new Author();
        author2.setAuthorId(2L);
        author2.setAuthorName("William Shakespeare");

        Author author3 = new Author();
        author3.setAuthorId(3L);
        author3.setAuthorName("J.K. Rowling");

        AUTHOR.add(author1);
        AUTHOR.add(author2);
        AUTHOR.add(author3);
    }

    public ArrayList<Author> getAllAuthors() {
        return AUTHOR;
    }

    public Author addAuthor(Author author) {
        AUTHOR.add(author);
        return author;
    }
}
