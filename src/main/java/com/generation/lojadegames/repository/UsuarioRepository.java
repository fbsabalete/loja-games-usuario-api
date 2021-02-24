package com.generation.lojadegames.repository;

import com.generation.lojadegames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
