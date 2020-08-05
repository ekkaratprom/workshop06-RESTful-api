package com.example.demo;

import java.util.List;

public class PagingResponse {

    private List<UserResponse> usersResponseList;
    private String page;
    private String itemPerPage;

    public void setUsersResponse(List<UserResponse> userResponseList) {
        this.usersResponseList = usersResponseList;
    }

    public PagingResponse(String page, String itemPerPage) {
        this.page = page;
        this.itemPerPage = itemPerPage;
    }

    public List<UserResponse> getUsersResponseList() {
        return usersResponseList;
    }

    public void setUsersResponseList(List<UserResponse> usersResponseList) {
        this.usersResponseList = usersResponseList;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getItemPerPage() {
        return itemPerPage;
    }

    public void setItemPerPage(String itemPerPage) {
        this.itemPerPage = itemPerPage;
    }
}
