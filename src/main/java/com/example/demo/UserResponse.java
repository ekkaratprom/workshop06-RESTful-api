package com.example.demo;

public class UserResponse {
    private int id;
    private String name;

    private int page;
    private int itemsPerPage;

//    public UserResponse(int id, String name) {
//        this.id = id;
//        this.name = name;
//
//    }

    public UserResponse(int page, int itemsPerPage) {
        this.page = page;
        this.itemsPerPage = itemsPerPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    //POJO (Plain Old Java Object)
    //Getter/Setter methods


//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
