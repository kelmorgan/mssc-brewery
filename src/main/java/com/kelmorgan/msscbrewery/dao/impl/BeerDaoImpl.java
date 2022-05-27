package com.kelmorgan.msscbrewery.dao.impl;

import com.kelmorgan.msscbrewery.dao.BeerDao;
import com.kelmorgan.msscbrewery.api.v1.models.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Slf4j
@Service
public class BeerDaoImpl implements BeerDao {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(beerId)
                .beerName("Star")
                .beerStyle("Shine Shine Bo Bo")
                .upc(new Random().nextLong())
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDto beerDto) {
        //to implement
        log.info("Beer Updated");
    }

    @Override
    public void deleteBeer(UUID id) {
        log.info("Beer with id : "+id + " deleted.");
    }

}
