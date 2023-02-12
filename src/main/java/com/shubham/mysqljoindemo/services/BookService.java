package com.shubham.mysqljoindemo.services;

import com.shubham.mysqljoindemo.entities.Book;
import com.shubham.mysqljoindemo.models.CreateBookRequestDTO;
import com.shubham.mysqljoindemo.models.CreateBookWithCategoryRequestDTO;
import com.shubham.mysqljoindemo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void createBook(CreateBookRequestDTO createBookRequestDTO){
        Book book = new Book(createBookRequestDTO.getName(),
                createBookRequestDTO.getAuthorName());
        bookRepository.save(book);
    }

    public void createBookWithCategory(CreateBookWithCategoryRequestDTO createBookWithCategoryRequestDTO){
        Book book = new Book(createBookWithCategoryRequestDTO.getName(),
                createBookWithCategoryRequestDTO.getAuthorName(),
                createBookWithCategoryRequestDTO.getBookCategoryId());
        bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }
}
