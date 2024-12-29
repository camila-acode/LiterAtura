package com.mcliterAtura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBooks(@JsonAlias("title") String titulo,
                        @JsonAlias("authors") List<AuthorsData> autor,
                        @JsonAlias("languages") List<String> idiomas,
                        @JsonAlias("download_count") double numeroDeDescargas) {
}
