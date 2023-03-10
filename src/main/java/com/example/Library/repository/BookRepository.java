package com.example.Library.repository;

import com.example.Library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query(value = "select * from book inner join copy on book.id = copy.book_id inner join borrowing  on copy.id = borrowing.copy_id where borrowing.borrower_id =:id", nativeQuery = true)
    List<Book> findByBorrowerId(@Param("id") Long id);
}
