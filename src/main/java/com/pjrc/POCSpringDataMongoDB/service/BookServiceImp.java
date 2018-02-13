package com.pjrc.POCSpringDataMongoDB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjrc.POCSpringDataMongoDB.exceptions.BookServiceException;
import com.pjrc.POCSpringDataMongoDB.models.Book;
import com.pjrc.POCSpringDataMongoDB.repository.BookRepository;

@Service
public class BookServiceImp implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book findById(int id) throws BookServiceException {
		return bookRepository.findOne(id);
	}

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void delete(Integer id) {
		bookRepository.delete(id);
		
	}

	@Override
	public void update(Book book) {
		bookRepository.save(book);		
	}

	
	
}
