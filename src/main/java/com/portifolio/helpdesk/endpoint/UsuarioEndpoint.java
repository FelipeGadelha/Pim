package com.portifolio.helpdesk.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portifolio.helpdesk.model.Usuario;
import com.portifolio.helpdesk.service.UsuarioService;

@RestController
@RequestMapping("/v1/user")
public class UsuarioEndpoint {

	@Autowired
	private final UsuarioService userService;
	
	public UsuarioEndpoint(UsuarioService userService) {
		this.userService = userService;
	}
	
	@GetMapping
	public List<Usuario> findAll() {
		List<Usuario> Users = userService.findAll();
		return Users;
	}
	
	@PostMapping
	public Usuario save(@RequestBody Usuario user) {
		userService.save(user);
		return user;
		
	}
}
