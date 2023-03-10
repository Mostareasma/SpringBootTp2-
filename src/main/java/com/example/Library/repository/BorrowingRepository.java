package com.example.Library.repository;

import com.example.Library.model.Book;
import com.example.Library.model.Borrower;
import com.example.Library.model.Borrowing;
import com.example.Library.model.Copy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {

    List<Borrowing> findByCopy(Copy copy);
}
