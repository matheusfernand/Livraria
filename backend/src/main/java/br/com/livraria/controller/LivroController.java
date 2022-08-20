package br.com.livraria.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.livraria.entity.Livro;
import br.com.livraria.repository.LivroRepository;

@RestController
@RequestMapping("livros")
public class LivroController {

	private LivroRepository livroRepository;

	public LivroController(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	@GetMapping("/lista/todos")
	public ResponseEntity<List<Livro>> listaTodos() {
		return ResponseEntity.ok(livroRepository.findAll());
	}
}