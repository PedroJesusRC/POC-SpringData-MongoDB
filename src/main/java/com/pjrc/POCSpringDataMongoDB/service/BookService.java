package com.pjrc.POCSpringDataMongoDB.service;

import java.util.List;

import com.pjrc.POCSpringDataMongoDB.exceptions.BookServiceException;
import com.pjrc.POCSpringDataMongoDB.models.Book;

public interface BookService {
	
	public List<Book> findAll();
	
	public Book findById(int id) throws BookServiceException;
	
	public Book addBook(Book book);
	
	public Book saveBook(Book book);
	
	public void delete(Integer id);
	
	public void update(Book book);

}
