package br.com.dicasdeumdev.api.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dicasdeumdev.api.domain.User;

public interface UserRespository extends JpaRepository<User, Integer>{

	Optional<User> findByEmail(String email);

}
