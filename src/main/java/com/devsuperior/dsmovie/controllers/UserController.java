package com.devsuperior.dsmovie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.dto.UserDTO;
import com.devsuperior.dsmovie.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {
		List<UserDTO> List = service.findAll();
		return ResponseEntity.ok(List);
	}

	@GetMapping(value = "/{id}")
	public UserDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
}
