package br.com.livraria.controller;

import br.com.livraria.entity.Pedido;
import br.com.livraria.repository.PedidoRepository;
import br.com.livraria.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
@SuppressWarnings("all")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Pedido> adiciona(@Valid @RequestBody Pedido pedido) {

        pedidoService.postPedido(pedido);
        return ResponseEntity.ok().body(pedido);
    }

//    @GetMapping("/lista/todos")
//    public ResponseEntity<List<Pedido>> listaTodos() {
//        return ResponseEntity.ok(pedidoRepository.findAll());
//    }
//
//    @GetMapping("/buscaporid/{id}")
//    public ResponseEntity<Pedido> buscaPorId(@PathVariable("id") Integer id) {
//        return pedidoRepository.findById(id).map(pedido -> {
//            return ResponseEntity.ok(pedido);
//        }).orElse(ResponseEntity.notFound().build());
//    }
}
