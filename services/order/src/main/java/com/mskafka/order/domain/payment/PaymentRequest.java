package com.mskafka.order.domain.payment;

import com.mskafka.order.domain.PaymentMethod;
import com.mskafka.order.domain.customer.CustomerResponse;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
