package com.shubham.mysqljoindemo.controllers;

import com.shubham.mysqljoindemo.entities.Book;
import com.shubham.mysqljoindemo.models.CreateBookRequestDTO;
import com.shubham.mysqljoindemo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create/book")
    public ResponseEntity createBook(@RequestBody CreateBookRequestDTO createBookRequestDTO){
        bookService.createBook(createBookRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/get/book/id/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    @GetMapping("/get/all/book")
    public ResponseEntity<List<Book>> getAllBook(){
        return ResponseEntity.ok(bookService.getAllBooks());
    }
}
