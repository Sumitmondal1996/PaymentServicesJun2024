package com.scaler.paymentservicesjune24.services;

import com.razorpay.RazorpayException;
import org.springframework.boot.configurationprocessor.json.JSONException;

public interface PaymentServices {
    public String generatePaymentLink(Long id) throws RazorpayException;
    public void handleWebhhook();
}
