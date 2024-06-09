package com.mskafka.order.domain.customer;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email
) {

}
