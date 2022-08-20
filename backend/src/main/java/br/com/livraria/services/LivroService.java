package br.com.livraria.services;

import br.com.livraria.entity.Livro;
import br.com.livraria.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;


    public List<Livro> findAllLivros() {
        return livroRepository.findAll();
    }
}
