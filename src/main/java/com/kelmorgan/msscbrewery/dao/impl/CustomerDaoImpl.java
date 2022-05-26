package com.kelmorgan.msscbrewery.dao.impl;

import com.kelmorgan.msscbrewery.dao.CustomerDao;
import com.kelmorgan.msscbrewery.api.v1.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(id)
                .name("Kufre")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.info("Updating Customer");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.info("delete customer");
    }
}
