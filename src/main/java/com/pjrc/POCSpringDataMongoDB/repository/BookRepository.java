package com.pjrc.POCSpringDataMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pjrc.POCSpringDataMongoDB.models.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer>{

}
