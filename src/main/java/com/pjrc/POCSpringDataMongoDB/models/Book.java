package com.pjrc.POCSpringDataMongoDB.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "BOOK")
public class Book {
	
	@Id
    private int id;
	
    private String title;
    
    private String author;

	public int getId() {
		return id;
	}
	
	public Book() {
		super();
	}

	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}

}
