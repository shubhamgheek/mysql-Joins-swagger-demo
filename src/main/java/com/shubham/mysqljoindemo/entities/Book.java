package com.shubham.mysqljoindemo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "author_name")
    private String authorName;

    @ManyToOne
    @JoinColumn
    private BookCategory bookCategory;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }

    public Book(String name, String authorName, Long bookCategoryId) {
        this.name = name;
        this.authorName = authorName;
        this.bookCategory = new BookCategory(bookCategoryId);
    }
}
