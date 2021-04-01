package com.viniciusaugusto.checkout.listener;

import com.viniciusaugusto.checkout.entity.CheckoutEntity;
import com.viniciusaugusto.checkout.enums.Status;
import com.viniciusaugusto.checkout.service.CheckoutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString, Status.APPROVED);
    }
}
