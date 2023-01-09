package us.inest.app.springboot.service;

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
}
