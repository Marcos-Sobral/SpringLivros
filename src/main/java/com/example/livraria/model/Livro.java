package com.example.livraria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private double preco;
    
    // Construtor vazio (necessário para JPA)
    public Livro(){}

    // Construtor com parâmetros
    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // Getters e Setters
    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){ this.titulo = titulo;}

    public String getAutor(){return autor;}
    public void setAutor(String autor){this.autor = autor;}

    public double getPreco(){return preco;}
    public void setPreco(double preco){this.preco = preco;}
}
