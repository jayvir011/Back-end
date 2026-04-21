package model;

import javax.persistence.*;

@Entity
@Table(name = "book_tab")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private BookAuthor author;

    public Book() {}
    public Book(String title, BookAuthor author) {
        this.title = title;
        this.author = author;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public BookAuthor getAuthor() { return author; }
    public void setAuthor(BookAuthor author) { this.author = author; }
}
