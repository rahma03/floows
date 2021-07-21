package mitrais.cdc.floows.controller;

import mitrais.cdc.floows.exceptions.BookNoteFoundException;
import mitrais.cdc.floows.model.Book;
import mitrais.cdc.floows.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: BookController.java, v 0.1 2021-07-16 13:39
 */

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public Iterable findAll(){
        return bookRepository.findAll();
    }

    @GetMapping ("/title/{bookTitle}")
    public List findByTitle(@PathVariable String bookTitle){
        return findByTitle(bookTitle);
    }

    @GetMapping("/{id}")
    public Book findOne(@PathVariable Long id){
        return bookRepository.findById(id).orElseThrow(BookNoteFoundException::new);
    }
}
