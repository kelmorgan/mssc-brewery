package com.kelmorgan.msscbrewery.api.v1.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
