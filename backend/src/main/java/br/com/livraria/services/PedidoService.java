package br.com.livraria.services;

import br.com.livraria.entity.Pedido;
import br.com.livraria.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido postPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
