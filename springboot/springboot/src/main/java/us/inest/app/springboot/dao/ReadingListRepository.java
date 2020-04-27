package us.inest.app.springboot.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import us.inest.app.springboot.model.Book;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}
