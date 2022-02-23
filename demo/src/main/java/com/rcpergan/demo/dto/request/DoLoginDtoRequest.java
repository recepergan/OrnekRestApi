package com.rcpergan.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class DoLoginDtoRequest {

    String username;
    String password;

    @JsonCreator
    public DoLoginDtoRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
