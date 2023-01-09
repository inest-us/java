package us.inest.app.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
    
    @GetMapping
    public String getPerson() {
        return "Person Controller";
    }

}
