package com.diegolopmon.springbootcourse.exercices.dataaccess.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    private Date postedOn;

    @ManyToOne
    private Author author;

    private Post() {

    }

    public Post(String title, String body, Date postedOn, Author author) {
        this.title = title;
        this.body = body;
        this.postedOn = postedOn;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", postedOn=" + postedOn +
                ", author=" + author +
                '}';
    }
}
