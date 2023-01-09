package us.inest.app.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @RequestMapping(value = "/product")
    public String product() {
        return "Product Controller";
    }
}
