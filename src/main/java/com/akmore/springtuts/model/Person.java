package com.akmore.springtuts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import java.util.UUID;
public class Person {
    private final UUID id;
    private final String name;
    public Person(@JsonProperty UUID id ,@JsonProperty String name){
        this.id = id;
        this.name = name;
    }

    public UUID getID() {
        return id;
    }
    public String getName(){
        return name;
    }
}
