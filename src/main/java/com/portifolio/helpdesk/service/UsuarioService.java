package com.portifolio.helpdesk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portifolio.helpdesk.model.Usuario;
import com.portifolio.helpdesk.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private final UsuarioRepository userRepository;
	
	public UsuarioService(UsuarioRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<Usuario> findAll(){
		  List<Usuario> findAll = userRepository.findAll();
		return findAll;
	}
	
	public Usuario save(Usuario user) {
		return userRepository.save(user);
	}
	
}
