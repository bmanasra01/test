package model;

public class Book {
    private int pages;
    private String title;
    private String catogry;

    public Book(int pages, String title, String catogry) {
        this.pages = pages;
        this.title = title;
        this.catogry = catogry;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatogry() {
        return catogry;
    }

    public void setCatogry(String catogry) {
        this.catogry = catogry;
    }
}
