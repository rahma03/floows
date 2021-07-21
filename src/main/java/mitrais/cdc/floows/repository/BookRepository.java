package mitrais.cdc.floows.repository;

import mitrais.cdc.floows.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: BookRepository.java, v 0.1 2021-07-16 13:20
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    List <Book> findByTitle (String title);
}
