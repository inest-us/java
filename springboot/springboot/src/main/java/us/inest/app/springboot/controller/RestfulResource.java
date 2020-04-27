package us.inest.app.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import us.inest.app.springboot.dao.ReadingListRepository;
import us.inest.app.springboot.model.Book;

@RestController
public class RestfulResource {
    private ReadingListRepository readingListRepository;
    @Value("${application.name}")
    private String appName;

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
        return "Hello " + this.appName;
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader, Model model) {
        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    @RequestMapping(value = "/{reader}", method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader, Book book) {
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";
    }
}
