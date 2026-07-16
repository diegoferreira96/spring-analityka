package br.com.backend.spring_analityka;

import br.com.backend.spring_analityka.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAnalitykaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringAnalitykaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.menu();
	}
}
