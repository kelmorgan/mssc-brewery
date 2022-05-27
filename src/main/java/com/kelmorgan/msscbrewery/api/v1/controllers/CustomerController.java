package com.kelmorgan.msscbrewery.api.v1.controllers;

import com.kelmorgan.msscbrewery.api.v1.models.CustomerDto;
import com.kelmorgan.msscbrewery.dao.CustomerDao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping(CustomerController.BASE_URL)
@RequiredArgsConstructor
public class CustomerController {

    public static final String BASE_URL = "api/v1/customer";
    private final CustomerDao customerDao;

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public CustomerDto getCustomerById(@PathVariable UUID id) {
        return customerDao.getCustomerById(id);
    }

    @PostMapping
    public ResponseEntity<Void> createBeer(@Valid @RequestBody CustomerDto customerDto) {
        CustomerDto saveCustomer = customerDao.saveCustomer(customerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", BASE_URL + "/" + saveCustomer.getId());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable UUID customerId,@Valid @RequestBody CustomerDto customerDto) {
        customerDao.updateCustomer(customerId, customerDto);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById(@PathVariable UUID customerId) {
        customerDao.deleteCustomer(customerId);
    }


}
