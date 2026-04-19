package guru.springframework.spring_6_webapp.Services;

import guru.springframework.spring_6_webapp.domain.Author;
import org.springframework.stereotype.Service;

public interface AuthorService {
    Iterable<Author> findAll();
}
