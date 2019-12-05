package com.lin.bean;

public class Book {
    private String bookName;
    private String author;

    public Book() {
        System.out.println("This is Author constructor.");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        System.out.println("This is Book setBookName().");
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        System.out.println("This is Book setAuthor().");
        this.author = author;
    }

    public void printBookInfo(){
        System.out.println("Book name: " + this.bookName + ", Author: " + this.author);
    }
}
