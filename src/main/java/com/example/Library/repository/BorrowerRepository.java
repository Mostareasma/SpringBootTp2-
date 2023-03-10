package com.example.Library.repository;

import com.example.Library.model.Book;
import com.example.Library.model.Borrower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Long> {

    @Query(value = "select * from borrower inner join borrowing  on borrower.id = borrowing.borrower_id inner join copy  on borrowing.copy_id = copy.id where book_id =:id", nativeQuery = true)
    List<Book> findByBookId (@Param("id") Long id);
}
