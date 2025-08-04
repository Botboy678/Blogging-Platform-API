package com.blogging.RESTAPI.model;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.List;

@Entity
public class BlogPost {

    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increment
    @Column
    private long id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private String category;

    @Column
    private List<String> tag;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {return title;}

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {return content;}

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {return category;}

    public void setCategory(String Category) {
        this.category = Category;
    }

    public List<String> getTag() {return tag;}

    public void setTag(List<String> tags) {
       this.tag = tags;
    }

}
