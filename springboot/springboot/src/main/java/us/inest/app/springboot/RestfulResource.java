package us.inest.app.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestfulResource {
    private ReadingListRepository readingListRepository;

    @Autowired
    public RestfulResource(ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }

    @RequestMapping(value = "/api")
    public String api() {
        return "REST API";
    }

    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }
}
