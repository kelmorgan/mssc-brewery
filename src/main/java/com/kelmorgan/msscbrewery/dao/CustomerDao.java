package com.kelmorgan.msscbrewery.dao;

import com.kelmorgan.msscbrewery.api.v1.model.CustomerDto;

import java.util.UUID;

public interface CustomerDao {

    CustomerDto getCustomerById(UUID id);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
