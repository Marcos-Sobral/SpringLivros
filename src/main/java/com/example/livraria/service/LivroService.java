package com.example.livraria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.livraria.model.Livro;
import com.example.livraria.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listarTodos(){
        return livroRepository.findAll();
    }

    public Optional<Livro> BuscarPorId(Long id){
        return livroRepository.findById(id);
    }

    public Livro salvar(Livro livro){
        return livroRepository.save(livro);
    }

    public void excluir(Long id){
        livroRepository.deleteById(id);
    }
}
