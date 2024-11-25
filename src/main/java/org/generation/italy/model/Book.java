package org.generation.italy.model;

public class Book {
    private int id;
    private String title;
    private int numPages;
    private double cost;
    public Book(int id, String title, int numPages, double cost){
       this.id = id;
       this.title = title;
       this.numPages = numPages;
       this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public double getCost() {
        return cost;
    }
}
