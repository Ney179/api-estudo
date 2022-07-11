package br.com.dicasdeumdev.api.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.repositories.UserRespository;

@Configuration
@Profile("local")
public class LocalConfig {
	
	@Autowired
	private UserRespository respository;

	@Bean
	public void startDB() {
		User u1 = new User(null, "Mirian", "mirian@gmail.com", "123");
		User u2 = new User(null, "Ana Luiza", "analuiza@gmail.com", "123");
		User u3 = new User(null, "Sabrina", "sabrina@gmail.com", "123");
		User u4 = new User(null, "Larissa", "larissa@gmail.com", "123");
		
		respository.saveAll(List.of(u1, u2, u3, u4));
	}
}
