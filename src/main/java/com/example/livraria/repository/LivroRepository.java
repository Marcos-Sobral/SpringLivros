package com.example.livraria.repository;

import com.example.livraria.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// Essa interface nos dá vários métodos prontos para usar com banco
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
