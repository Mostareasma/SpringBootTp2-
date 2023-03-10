package com.example.Library.repository;

import com.example.Library.model.Book;
import com.example.Library.model.Copy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CopyRepository extends JpaRepository<Copy, Long> {

    List<Copy> findByBook(Book book);


    @Query(value = "select * from copy inner join borrowing  on borrowing.copy_id = copy.id where date_of_borrowing < now() and return_date is null and book_id = :id", nativeQuery = true)
    List<Copy> findBorrowedCopiesByBookId(@Param("id") Long id);
}
