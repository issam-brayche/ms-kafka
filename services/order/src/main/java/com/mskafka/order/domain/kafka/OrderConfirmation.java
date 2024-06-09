package com.mskafka.order.domain.kafka;

import com.mskafka.order.domain.PaymentMethod;
import com.mskafka.order.domain.customer.CustomerResponse;
import com.mskafka.order.domain.purchase.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
