package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);
}
