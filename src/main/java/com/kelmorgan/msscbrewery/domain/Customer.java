package com.kelmorgan.msscbrewery.domain;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@Builder
public class Customer {


    private UUID id;
    private String name;

    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
