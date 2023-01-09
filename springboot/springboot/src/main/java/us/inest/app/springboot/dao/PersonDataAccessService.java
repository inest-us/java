package us.inest.app.springboot.dao;

import java.util.*;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import us.inest.app.springboot.model.Person;

@Repository("PersonDataAccessService")
public class PersonDataAccessService implements PersonDao {
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
    
}
