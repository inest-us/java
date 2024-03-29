package us.inest.app.springboot.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import us.inest.app.springboot.dao.PersonDao;
import us.inest.app.springboot.model.Person;

@Service
public class PersonService {
    private final PersonDao personDao;
    
    @Autowired
    public PersonService(@Qualifier("PersonDataAccessService") PersonDao personDao) {
        this.personDao = personDao;
    }
    
    public int addPerson(Person person) {
        return personDao.addPerson(person);
    }
    
    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }
    
    public Optional<Person> getPersonById(UUID id) {
        return personDao.selectPersonById(id);
    }
    
    public int deletePerson(UUID id) {
        return personDao.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person newPerson) {
        return personDao.updatePersonById(id, newPerson);
    }
}
