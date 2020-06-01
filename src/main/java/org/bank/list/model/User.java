package org.bank.list.model;

import lombok.*;

//import java.util.Objects;
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {
    private int userId;
    private String name;
    private String sureName;

    public User() {
    }

    public User(int userId, String name, String sureName) {
        this.userId = userId;
        this.name = name;
        this.sureName = sureName;
    }
}
