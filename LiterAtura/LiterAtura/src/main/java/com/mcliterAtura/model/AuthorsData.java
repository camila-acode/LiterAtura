package com.mcliterAtura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record AuthorsData( @JsonAlias("name") String nombre,
                           @JsonAlias("birth_year") int fechaDeNacimiento,
                           @JsonAlias("death_year") int fechaDeFallecimiento) {
}
