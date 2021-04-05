package com.upgrad.SwaggerExample.controller;

import com.upgrad.SwaggerExample.model.Author;
import com.upgrad.SwaggerExample.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/authors")

@Api(value = "Author's API", description = "Author's Details")
public class AuthorController {

    // IOC
    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/getAllAuthors", method = RequestMethod.GET)
    @ApiOperation(value = "GET Authors", notes = "GET all the authors")
    public ArrayList<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @RequestMapping(value = "/addAuthor", method = RequestMethod.POST)
    @ApiOperation(value = "POST Authors", notes = "Post an Author, and returns the added author back.")
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }
}
