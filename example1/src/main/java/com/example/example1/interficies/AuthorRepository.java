package com.example.example1.interficies;


import com.example.example1.domini.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author, Integer>{

//     Iterable<Author> getAllAuthors();
//
//     Author createAuthor(Author author);
//
//     String findAndDeleteAuthor(int id);
//
//     void deleteAuthorById(int id);
//
//     Author updateAuthor(int id, Author newAuthor);
//
//     long count();
//
//     boolean existsById(int id);

	// find, create, get , delete by id ,update by id
}