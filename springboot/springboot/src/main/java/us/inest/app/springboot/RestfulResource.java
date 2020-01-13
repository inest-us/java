package us.inest.app.springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class RestfulResource {
    @RequestMapping(value = "/api")
    public String api() {
        return "REST API";
    }
    
    @RequestMapping(value = "/")
    public String hello() {
        return "Hello World";
    }
}
