package com.viniciusaugusto.checkout.service;

import com.viniciusaugusto.checkout.entity.CheckoutEntity;
import com.viniciusaugusto.checkout.enums.Status;
import com.viniciusaugusto.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public class CheckoutServiceImpl implements CheckoutService{

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest) {
        return Optional.empty();
    }

    @Override
    public Optional<CheckoutEntity> updateStatus(String checkoutCode, Status status) {
        return Optional.empty();
    }
}