package com.scaler.paymentservicesjune24.ApplicationConfig;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {
    @Value("${razorpay.key.id}")
    public String key;
    @Value("${razorpay.key.secret}")
    public String secret;
    @Bean
    public RazorpayClient createRazorpayClient() throws RazorpayException {
        return new RazorpayClient(key, secret);
    }
}
