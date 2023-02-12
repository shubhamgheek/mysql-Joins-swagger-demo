package com.shubham.mysqljoindemo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Table(name = "book_category")
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "bookCategory")
    private Set<Book> books;

    public BookCategory(String name) {
        this.name = name;
    }

    public BookCategory(Long id) {
        this.id = id;
    }
}
