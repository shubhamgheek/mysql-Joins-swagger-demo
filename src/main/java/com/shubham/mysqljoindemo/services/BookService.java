package com.shubham.mysqljoindemo.services;

import com.shubham.mysqljoindemo.entities.Book;
import com.shubham.mysqljoindemo.entities.BookCategory;
import com.shubham.mysqljoindemo.models.CreateBookRequestDTO;
import com.shubham.mysqljoindemo.repositories.BookCategoryRepository;
import com.shubham.mysqljoindemo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    public void createBook(CreateBookRequestDTO createBookRequestDTO){
        Optional<BookCategory> bookCategoryOptional = bookCategoryRepository
                .findById(createBookRequestDTO.getBookCategoryId());
        Book book;
        if(bookCategoryOptional.isPresent()){
            book = new Book(createBookRequestDTO.getName(), createBookRequestDTO.getAuthorName(),
                    createBookRequestDTO.getCost(), bookCategoryOptional.get());
        }else{
            book = new Book(createBookRequestDTO.getName(), createBookRequestDTO.getAuthorName(),
                    createBookRequestDTO.getCost());
        }
        bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }
}
