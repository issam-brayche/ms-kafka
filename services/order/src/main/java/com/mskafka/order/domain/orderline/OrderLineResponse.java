package com.mskafka.order.domain.orderline;

public record OrderLineResponse(
        Integer id,
        double quantity
) { }
