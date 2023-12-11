package com.tobeto.spring.b.java.repostories;

import com.tobeto.spring.b.java.entities.PaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PaymentDetailRepository extends JpaRepository<PaymentDetail,Integer> {
    //boolean existsByDate(LocalDate date);


}
