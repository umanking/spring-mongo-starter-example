package com.example.springmongostarterexample;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "account")
public class Account {

    @Id
    private String id;
    private String name;
    private int age;
    private String email;

    public Account() {
    }

    public Account(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Account(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
