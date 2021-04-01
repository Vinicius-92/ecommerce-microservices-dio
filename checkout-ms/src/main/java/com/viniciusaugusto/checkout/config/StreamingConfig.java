package com.viniciusaugusto.checkout.config;

import com.viniciusaugusto.checkout.streaming.CheckoutCreatedSource;
import com.viniciusaugusto.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
