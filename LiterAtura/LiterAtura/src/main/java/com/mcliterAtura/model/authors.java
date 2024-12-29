package com.mcliterAtura.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "autores")
public class authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int fechaDeNacimiento;
    private int fechaDeFallecimiento;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.EAGER) // con EAGER traemos los datos de forma ansiosa (bases de datos)
    private List<Books> libros = new ArrayList<>();

    public authors(AuthorsData datosAutores) {
        this.name = datosAutores.nombre();
        this.fechaDeNacimiento = datosAutores.fechaDeNacimiento();
        this.fechaDeFallecimiento = datosAutores.fechaDeFallecimiento();
    }
    public authors(){}
    public String getName(){ return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getFechaDeFallecimiento() {
        return fechaDeFallecimiento;
    }

    public void setFechaDeFallecimiento(int fechaDeFallecimiento) {
        this.fechaDeFallecimiento = fechaDeFallecimiento;
    }

    public List<Books> getLibros() {
        return libros;
    }

    public void setLibros(List<Books> libros) {
        this.libros = libros;
    }

    @Override
    // Obtener el título de los libros
    public String toString() {
        StringBuilder librosTitulos = new StringBuilder();
        for (Books libro : libros) {
            librosTitulos.append(libro.getTitulo()).append(", ");
        }

        // Eliminar la última coma y espacio
        if (librosTitulos.length() > 0) {
            librosTitulos.setLength(librosTitulos.length() - 2);
        }

        return  "--------------- AUTOR ---------------" + "\n" +
                "Autor: " + name + "\n" +
                "Fecha de nacimiento: " + fechaDeNacimiento + "\n" +
                "Fecha de fallecimiento: " + fechaDeFallecimiento + "\n" +
                "Libros: " + librosTitulos + "\n";
    }
}
