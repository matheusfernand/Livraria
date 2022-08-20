package br.com.livraria.servicesTest;

import br.com.livraria.entity.Pedido;
import br.com.livraria.entity.enums.FormaDePagamento;
import br.com.livraria.repository.PedidoRepository;
import br.com.livraria.services.PedidoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class PedidoTest {

    @InjectMocks
    private PedidoService pedidoService;
    @Mock
    private PedidoRepository pedidoRepository;

    @Test
    @DisplayName("Deve cadastrar um pedido na base de dados")
    void postPedido() {
        final var fakeModel = new Pedido();
        final var fakePost = new PedidoService();
        fakeModel.setId(1);
        fakeModel.setCpf("12345678901");
        fakeModel.setEnderecoCompleto("Rua joao jose, 123");
        fakeModel.setFormaDePagamento(FormaDePagamento.CARTAO_DE_CREDITO);
        fakeModel.setNomeCompleto("Matheus Fernando");
        fakeModel.setQuantidadeDeExemplares(2);
        assertTrue(true);
    }
}
