package com.scaler.paymentservicesjune24.controller;

import com.razorpay.RazorpayException;
import com.scaler.paymentservicesjune24.dtos.PaymentRequestdto;
import com.scaler.paymentservicesjune24.services.PaymentServices;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class PaymentController {

    public PaymentServices paymentServices;
    public PaymentController(PaymentServices paymentServices) {
        this.paymentServices = paymentServices;
    }

    public String generatePaymentLink(@RequestBody PaymentRequestdto paymentRequestdto) throws RazorpayException {
        return paymentServices.generatePaymentLink(paymentRequestdto.getOrderid());
    }
}
