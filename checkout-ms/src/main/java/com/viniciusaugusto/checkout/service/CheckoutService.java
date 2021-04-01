package com.viniciusaugusto.checkout.service;

import com.viniciusaugusto.checkout.entity.CheckoutEntity;
import com.viniciusaugusto.checkout.resource.checkout.CheckoutRequest;
import com.viniciusaugusto.checkout.enums.Status;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
    Optional<CheckoutEntity> updateStatus(String checkoutCode, Status status);
}
