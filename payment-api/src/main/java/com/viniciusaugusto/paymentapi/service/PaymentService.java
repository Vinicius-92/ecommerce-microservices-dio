package com.viniciusaugusto.paymentapi.service;

import com.viniciusaugusto.paymentapi.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);

}
