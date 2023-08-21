package LatestBook.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/books")
public class MyBooksController {

    @Autowired
    private MyBooksService booksService;
    @GetMapping
    public ResponseEntity<List<MyBooks>> getAllBooks(){
        return new ResponseEntity<List<MyBooks>>(booksService.allBooks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<MyBooks>> getBook(@PathVariable long id){
        return new ResponseEntity<Optional<MyBooks>>(booksService.oneBook(id), HttpStatus.OK);
    }
}
