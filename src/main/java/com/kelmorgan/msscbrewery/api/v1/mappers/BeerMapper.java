package com.kelmorgan.msscbrewery.api.v1.mappers;

import com.kelmorgan.msscbrewery.api.v1.models.BeerDto;
import com.kelmorgan.msscbrewery.domain.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
