package mitrais.cdc.floows.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

/**
 * @author Rahmawati Sitti Azizah
 * @version $Id: Book.java, v 0.1 2021-07-16 13:10
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
