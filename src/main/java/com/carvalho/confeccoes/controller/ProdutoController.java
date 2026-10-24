package com.carvalho.confeccoes.controller;

import com.carvalho.confeccoes.model.Produto;
import com.carvalho.confeccoes.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
@CrossOrigin(origins = "*") // Essencial: Permite que o Angular (em outra porta/domínio) acesse esta API
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listarProdutos() {
        // Vai no banco de dados, pega todos os produtos e devolve como uma lista JSON para o Angular
        return produtoRepository.findAll();
    }
}