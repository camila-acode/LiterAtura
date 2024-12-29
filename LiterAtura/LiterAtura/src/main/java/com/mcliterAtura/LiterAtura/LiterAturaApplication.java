package com.mcliterAtura.LiterAtura;

import com.mcliterAtura.principal.Principal;
import com.mcliterAtura.repository.AuthorRepository;
import com.mcliterAtura.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAturaApplication implements CommandLineRunner {


	@Autowired
	private AuthorRepository autoresRepositorio;
	@Autowired
	private BookRepository librosRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(LiterAturaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autoresRepositorio,librosRepositorio);
		principal.muestraElMenu();

	}

}
