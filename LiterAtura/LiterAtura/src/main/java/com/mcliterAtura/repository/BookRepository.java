package com.mcliterAtura.repository;

import com.mcliterAtura.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Books, Long> {
    Books findByTitulo (String titulo); //finBy encontrar por el atributo, en este caso titulo titulo

    List<Books> findByIdiomasContaining(String idiomas);
}
