package com.pjrc.POCSpringDataMongoDB.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "BOOK")
public class Book {
	
	@Id
    @Field("id")
    private int id;
	
	@NotNull
    @Size(min = 1)
    @Field("title")
    private String title;
    
	@NotNull
    @Size(min = 1)
    @Field("author")
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

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	

}
