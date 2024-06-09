package com.mskafka.ecommerce.dao;

import com.mskafka.ecommerce.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String > {
}
