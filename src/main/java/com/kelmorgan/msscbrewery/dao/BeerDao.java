package com.kelmorgan.msscbrewery.dao;

import com.kelmorgan.msscbrewery.api.v1.models.BeerDto;

import java.util.UUID;

public interface BeerDao {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(UUID id, BeerDto beerDto);

    void deleteBeer(UUID id);
}
