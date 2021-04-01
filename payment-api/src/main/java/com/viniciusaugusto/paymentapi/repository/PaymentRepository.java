package com.viniciusaugusto.paymentapi.repository;

import com.viniciusaugusto.paymentapi.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
