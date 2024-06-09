package com.mskafka.notification.domain.kafka;

public record Customer(
        String id,
        String firstname,
        String lastname,
        String email
) {

}
