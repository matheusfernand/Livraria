package br.com.livraria.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.livraria.entity.Pedido;
import br.com.livraria.repository.PedidoRepository;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;

	@PostMapping
	public ResponseEntity<Pedido> adiciona(@Valid @RequestBody Pedido pedido) {

		pedidoRepository.save(pedido);
		return ResponseEntity.ok().body(pedido);
	}

	@GetMapping("/lista/todos")
	public ResponseEntity<List<Pedido>> listaTodos() {
		return ResponseEntity.ok(pedidoRepository.findAll());
	}

	@GetMapping("/buscaporid/{id}")
	public ResponseEntity<Pedido> buscaPorId(@PathVariable("id") Integer id) {
		return pedidoRepository.findById(id).map(pedido -> {
			return ResponseEntity.ok(pedido);
		}).orElse(ResponseEntity.notFound().build());
	}

}
