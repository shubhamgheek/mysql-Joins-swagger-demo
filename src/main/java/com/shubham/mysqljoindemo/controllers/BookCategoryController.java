package com.shubham.mysqljoindemo.controllers;

import com.shubham.mysqljoindemo.entities.BookCategory;
import com.shubham.mysqljoindemo.models.CreateBookCategoryRequestDTO;
import com.shubham.mysqljoindemo.services.BookCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookCategoryController {

    @Autowired
    private BookCategoryService bookCategoryService;

    @PostMapping("/create/book-category")
    public ResponseEntity createBookCategory(@RequestBody CreateBookCategoryRequestDTO createBookCategoryRequestDTO){
        bookCategoryService.createBookCategory(createBookCategoryRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/get/book-category/id/{id}")
    public ResponseEntity<BookCategory> getBookCategory(@PathVariable Long id){
        return ResponseEntity.ok(bookCategoryService.getBookCategoryById(id));
    }

    @GetMapping("/get/all/book-category")
    public ResponseEntity<List<BookCategory>> getAllBookCategory(){
        return ResponseEntity.ok(bookCategoryService.getAllBookCategory());
    }
}
