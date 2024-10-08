package us.inest.app.springboot.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.Nonnull;
import us.inest.app.springboot.model.Person;
import us.inest.app.springboot.service.PersonService;

@RequestMapping(value = "/person")
@RestController
public class PersonController {
    private final PersonService personService;
    
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    
    @PostMapping
    public void addPerson(@Validated @Nonnull @RequestBody Person person) {
        personService.addPerson(person);
    }
    
    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping(path="{id}")
    public Person getPersonById(@PathVariable("id") UUID id) {
        return personService.getPersonById(id)
                .orElse(null);
    }
    
    @DeleteMapping(path="{id}")
    public void deletePersonById(@PathVariable("id") UUID id) {
        personService.deletePerson(id);
    }
    
    @PutMapping(path="{id}")
    public int updatePersonById(@PathVariable("id") UUID id, @Validated @Nonnull @RequestBody Person personToUpdate) {
        return personService.updatePerson(id, personToUpdate);
    }
    
}
