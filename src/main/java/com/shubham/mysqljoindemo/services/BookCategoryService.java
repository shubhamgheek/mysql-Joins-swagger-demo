package com.shubham.mysqljoindemo.services;

import com.shubham.mysqljoindemo.entities.BookCategory;
import com.shubham.mysqljoindemo.models.CreateBookCategoryRequestDTO;
import com.shubham.mysqljoindemo.repositories.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCategoryService {

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    public void createBookCategory(CreateBookCategoryRequestDTO createBookCategoryRequestDTO){
        BookCategory bookCategory = new BookCategory(createBookCategoryRequestDTO.getName());
        bookCategoryRepository.save(bookCategory);
    }

    public List<BookCategory> getAllBookCategory(){
        return bookCategoryRepository.findAll();
    }

    public BookCategory getBookCategoryById(Long id){
        return bookCategoryRepository.findById(id).orElse(null);
    }
}
