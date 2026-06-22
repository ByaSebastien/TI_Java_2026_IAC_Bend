package be.bstorm.bend.utils.initializer;

import be.bstorm.bend.entities.Book;
import be.bstorm.bend.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

        if(bookRepository.count() == 0) {
            List<Book> books = List.of(
                    new Book("Toto à la playa"),
                    new Book("Toto à la montagne"),
                    new Book("Toto à la piscine")
            );

            bookRepository.saveAll(books);
        }
    }
}
