package com.example.example1.commandLine;


import com.example.example1.domini.Author;
import com.example.example1.services.AuthorService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationCommandRun implements CommandLineRunner {

    private final Log logger = LogFactory.getLog(getClass());

    @Autowired
    AuthorService authorService;


    @Override
    public void run(String... args) throws Exception {

        //name, country, dob, qtyBooks, alive)
        Author author1 = new Author("William Shakespeare", "Unite Kigndoom", 1564, 48, false);
        Author author2 = new Author("Enric", "Moiá", 1997, 0, true);
        Author author3 = new Author("Un altre autor més", "Algún lloc", 2000, 2, true);


        authorService.createAuthor(author1);
        authorService.createAuthor(author2);
        authorService.createAuthor(author3);




        logger.info("count: " + authorService.count());
        logger.info(authorService.getAllAuthors());
        logger.info("exists ['1']: " + authorService.existsById(1));



//
//
//        authorService.findAndDeleteAuthor(1);
//
//        logger.info("count: " + authorService.count());
//        logger.info(authorService.getAllAuthors());
//        logger.info("exists ['1']: " + authorService.existsById(1));
//
//        authorService.createAuthor(new Author("5", "Paul", "Mendez"));
//
//
//        logger.info("count: " + authorService.count());
//        logger.info(authorService.getAllAuthors());
//        logger.info("exists ['1']: " + authorService.existsById(1));
//        logger.info("exists ['5']: " + authorService.existsById(5));






    }
}
