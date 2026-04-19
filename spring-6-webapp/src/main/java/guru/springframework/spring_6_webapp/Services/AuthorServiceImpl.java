package guru.springframework.spring_6_webapp.Services;

import guru.springframework.spring_6_webapp.domain.Author;
import guru.springframework.spring_6_webapp.repositories.AuthorRepository;
import guru.springframework.spring_6_webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
