package com.example.example1.interficies;


import java.util.Optional;

import com.example.example1.domini.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book, Integer>{

	Optional<Book> findById(String id);

	void deleteById(String id);

	boolean existsById(String id);

	long countByAuthor(String author);

	void deleteByAuthor(String author);

}