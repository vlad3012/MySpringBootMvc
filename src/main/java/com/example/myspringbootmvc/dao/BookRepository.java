package com.example.myspringbootmvc.dao;

import com.example.myspringbootmvc.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
    List<Book> findAllById(int id);
    List<Book> findBooksByAuthorStartsWith(String author);

    @Query(
            value = "from Book WHERE name like '?1'")
    List<Book> findBookByName(String name);
}
