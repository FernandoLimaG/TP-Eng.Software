package br.pucminas.ec.gestor_estoque_pereciveis.controller;

import br.pucminas.ec.gestor_estoque_pereciveis.model.Produto;
import br.pucminas.ec.gestor_estoque_pereciveis.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public String listar(Model model) {

        model.addAttribute("produtos", produtoRepository.findAll());

        return "produtos";
    }

    @PostMapping("/produtos")
    public String salvar(Produto produto) {
        produtoRepository.save(produto);
        return "redirect:/produtos";
    }
}