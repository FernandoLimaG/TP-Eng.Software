package br.pucminas.ec.gestor_estoque_pereciveis.controller;

import br.pucminas.ec.gestor_estoque_pereciveis.model.Produto;
import br.pucminas.ec.gestor_estoque_pereciveis.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.time.LocalDate;

@Controller
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/produtos")
    public String listar(Model model) {

        model.addAttribute("produtos", produtoRepository.findAll());

        return "produtos";
    }

    @GetMapping("/produtos/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        produtoRepository.deleteById(id);
        return "redirect:/produtos";
    }

    @PostMapping("/produtos")
    public String salvar(Produto produto) {
        // --Validacao basica de entrada do usuario (nao possui alerta de erro ainda, apenhas falha)
        boolean validacaoNome =  produto.getNome() != null && !produto.getNome().trim().isEmpty();
        boolean validacaoDataValidade = !produto.getValidade().isBefore(LocalDate.now());
        boolean validacaoQuantidade = produto.getQuantidade() > 0;
        if(validacaoNome && validacaoDataValidade && validacaoQuantidade){
            produtoRepository.save(produto);
        }
        return "redirect:/produtos";
    }
}