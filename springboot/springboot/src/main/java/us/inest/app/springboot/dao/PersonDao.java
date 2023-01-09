package us.inest.app.springboot.dao;

import java.util.UUID;

import us.inest.app.springboot.model.Person;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    
    default int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}
