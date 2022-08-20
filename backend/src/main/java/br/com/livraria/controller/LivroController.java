package br.com.livraria.controller;

import br.com.livraria.entity.Livro;
import br.com.livraria.repository.LivroRepository;
import br.com.livraria.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("livros")
@SuppressWarnings("all")
public class LivroController {

	@Autowired
	private LivroService livroService;

	@GetMapping("/lista/todos")
	public ResponseEntity<List<Livro>> listaTodos() {
		List<Livro> finded = livroService.findAllLivros();
		return ResponseEntity.ok().body(finded);
	}
}