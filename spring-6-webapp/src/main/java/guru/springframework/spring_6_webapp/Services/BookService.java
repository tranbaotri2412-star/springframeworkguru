package guru.springframework.spring_6_webapp.Services;

import guru.springframework.spring_6_webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
