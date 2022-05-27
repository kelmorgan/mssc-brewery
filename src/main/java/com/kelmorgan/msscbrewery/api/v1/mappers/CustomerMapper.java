package com.kelmorgan.msscbrewery.api.v1.mappers;

import com.kelmorgan.msscbrewery.api.v1.models.CustomerDto;
import com.kelmorgan.msscbrewery.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto  customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
