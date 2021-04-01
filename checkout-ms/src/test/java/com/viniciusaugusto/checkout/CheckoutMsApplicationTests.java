package com.viniciusaugusto.checkout;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:build/cucumber-api-report.json"}, features = "classpath:feature")
@SpringBootTest
class CheckoutMsApplicationTests {
}
