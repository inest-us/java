package us.inest.app.springboot.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;

public class Person {
    private final UUID id;
    
    @NotNull
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
