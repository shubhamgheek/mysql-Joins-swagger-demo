package com.shubham.mysqljoindemo.models;

import lombok.Data;

@Data
public class CreateBookRequestDTO {
    private String name;
    private String authorName;
    private String cost;
    private Long bookCategoryId;
}
