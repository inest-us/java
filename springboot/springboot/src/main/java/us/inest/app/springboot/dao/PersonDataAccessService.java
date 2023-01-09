package us.inest.app.springboot.dao;

import java.util.*;

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

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return DB.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> personToDelete = selectPersonById(id);
        if (personToDelete.isEmpty()) {
            return 0;
        }
        DB.remove(personToDelete.get());
        return 1;
    }

    @Override
    public int updatePersonById(UUID id, Person personToUpdate) {
        return selectPersonById(id)
                .map(p -> {
                   int index = DB.indexOf(p);
                   if (index >= 0) {
                       DB.set(index, new Person(id, personToUpdate.getName()));
                       return 1;                       
                   }
                   return 0;
                })
                .orElse(0);
    }
    
}
