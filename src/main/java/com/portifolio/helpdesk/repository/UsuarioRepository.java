package com.portifolio.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portifolio.helpdesk.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
