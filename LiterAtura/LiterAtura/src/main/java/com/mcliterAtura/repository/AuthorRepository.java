package com.mcliterAtura.repository;

import com.mcliterAtura.model.authors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<authors, Long> {
    authors findByNameIgnoreCase(String nombre);
    List<authors> findByFechaDeNacimientoLessThanEqualAndFechaDeFallecimientoGreaterThanEqual(int anoInicial, int anoFinal);
}
