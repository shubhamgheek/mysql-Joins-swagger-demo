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

    @Column(name = "cost")
    private String cost;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private BookCategory bookCategory;

    public Book(String name, String authorName, String cost) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

    public Book(String name, String authorName, String cost, BookCategory bookCategory) {
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
        this.bookCategory = bookCategory;
    }
}
