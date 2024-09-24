package us.inest.app.springboot.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;

public class Person {
    private final UUID id;
    
    @Nonnull
    private final String name;
    
    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }
    
    public UUID getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}
