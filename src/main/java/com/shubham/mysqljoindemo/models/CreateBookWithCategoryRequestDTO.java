package com.shubham.mysqljoindemo.models;

import lombok.Data;

@Data
public class CreateBookWithCategoryRequestDTO {
    private String name;
    private String authorName;
    private Long bookCategoryId;
}
