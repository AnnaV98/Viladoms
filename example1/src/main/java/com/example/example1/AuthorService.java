package com.example.example1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    static List<Author> authors = new ArrayList<Author>();

    public AuthorService() {
        if (authors.isEmpty())
            generateAuthors();
    }

    private void generateAuthors() {
        //name, country, dob, qtyBooks, alive)
        Author author1 = new Author(14022022, "William Shakespeare", "Unite Kigndoom", 1564, 48, false);
        Author author2 = new Author(16022022, "Enric", "Moiá", 1997, 0, true);
        Author author3 = new Author(17022022, "Un altre autor més", "Algún lloc", 2000, 2, true);

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
    }


    public List<Author> queryAuthor() {
        return authors;
    }

    public Author addAuthorToArray(Author author) {
        // TODO Auto-generated method stub
        authors.add(author);
        return author;
    }

    //Els equals sol funcionen amb variables tipus String
    public int findAuthorById(int id) {
        int index = -1;

        for (Author authorTemp : authors) {
            if (authorTemp.getId() == id) {
                index = authors.indexOf(authorTemp);
                break;
                //return index;
            }
        }
        return index;
    }

    public void deleteAuthorFromArray(int id) {
        int index = findAuthorById(id);
        authors.remove(index);
    }
    
    public Author getAuthorByIndex (int index) {
    
    	return authors.get(index);
    }

	public Author replaceAuthor(int index, Author authorToUpdate) {
		// TODO Auto-generated method stub
		authors.set(index, authorToUpdate);
		return authorToUpdate;
	}


}
