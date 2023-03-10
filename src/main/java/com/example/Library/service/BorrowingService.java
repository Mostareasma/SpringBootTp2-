package com.example.Library.service;

import com.example.Library.model.Borrowing;
import com.example.Library.model.Copy;
import com.example.Library.repository.BorrowerRepository;
import com.example.Library.repository.BorrowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BorrowingService {

    @Autowired
    BorrowingRepository borrowingepository;

    public List<Borrowing> getByCopy(Copy copy){
        return borrowingepository.findByCopy(copy);
    }

}
