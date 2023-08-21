package LatestBook.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyBooksService {

    @Autowired
    private MyBooksRepository booksRepository;
    public List<MyBooks> allBooks(){
        return booksRepository.findAll();
    }

    public Optional<MyBooks> oneBook(long id){
        return booksRepository.findById(id);
    }
}
