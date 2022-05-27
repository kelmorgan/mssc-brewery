package com.kelmorgan.msscbrewery.api.v1.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@Builder
public class CustomerDto {

    @Null
    private UUID id;

    @NotBlank
    @Size(min = 3,max = 100)
    private String name;
}
