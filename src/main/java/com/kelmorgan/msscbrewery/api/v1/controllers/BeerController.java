package com.kelmorgan.msscbrewery.api.v1.controllers;

import com.kelmorgan.msscbrewery.dao.BeerDao;
import com.kelmorgan.msscbrewery.api.v1.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping(BeerController.BASE_URL)
public class BeerController {

    public final static String BASE_URL = "/api/v1/beer";

    private final BeerDao beerDao;

    @GetMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.OK)
    public BeerDto getBeer(@PathVariable UUID beerId) {
        return beerDao.getBeerById(beerId);
    }

    @PostMapping
    public ResponseEntity<Void> createBeer(@Valid @RequestBody BeerDto beerDto) {

        BeerDto savedBeerDto = beerDao.saveBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", BASE_URL + "/" + savedBeerDto.getId());

        return new ResponseEntity<>(headers, HttpStatus.CREATED);

    }

    @PutMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBeer(@PathVariable UUID beerId, @Valid @RequestBody BeerDto beerDto) {
        beerDao.updateBeer(beerId, beerDto);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById(@PathVariable UUID beerId) {
        beerDao.deleteBeer(beerId);
    }




}
