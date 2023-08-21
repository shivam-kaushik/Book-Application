package LatestBook.demo;
import jakarta.persistence.*;

import java.sql.Blob;

//import javax.persistence.*;
@Entity
@Table
public class MyBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String description;

    @Column
    private Blob image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public MyBooks(int id, String title, String author, String desc, Blob image) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = desc;
        this.image = image;
    }

    public MyBooks() {
    }
}
