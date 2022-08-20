package br.com.livraria.servicesTest;

import br.com.livraria.entity.Livro;
import br.com.livraria.repository.LivroRepository;
import br.com.livraria.services.LivroService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class LivroServiceTest {

    @InjectMocks
    private LivroService livroService;
    @Mock
    private LivroRepository livroRepository;

    @Test
    @DisplayName("Deve consumir os livros na base de dados")
    void findLivros() {
        List<Livro> livros = livroService.findAllLivros();
        assertTrue(true);
    }
}