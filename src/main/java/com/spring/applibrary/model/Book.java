package com.spring.applibrary.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String subName;
    private String serialNo;
    private String author;
    private String publishingHouse;
    private String isbnnumber;
    private String description;

    public Book(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbnnumber() {
        return isbnnumber;
    }

    public void setIsbnnumber(String isbnnumber) {
        this.isbnnumber = isbnnumber;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Book(int id, String name, String subName, String serialNo, String author, String publishingHouse, String isbnNumber, String description) {
        this.id = id;
        this.name = name;
        this.subName = subName;
        this.serialNo = serialNo;
        this.author = author;
        this.publishingHouse = publishingHouse;
        isbnnumber = isbnNumber;
        this.description = description;
    }

}
