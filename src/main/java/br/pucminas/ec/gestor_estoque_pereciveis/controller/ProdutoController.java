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

    @PostMapping("/produtos")
    public String salvar(Produto produto) {
        produto.setId(null);

        boolean validacaoNome =  produto.getNome() != null && !produto.getNome().trim().isEmpty();
        boolean validacaoDataValidade = !produto.getValidade().isBefore(LocalDate.now());
        boolean validacaoQuantidade = produto.getQuantidade() > 0;
        if(validacaoNome && validacaoDataValidade && validacaoQuantidade){
            produtoRepository.save(produto);
        }
        return "redirect:/produtos";
    }

    @GetMapping("/produtos")
    public String listar(Model model) {
        model.addAttribute("produtos", produtoRepository.findAll());
        model.addAttribute("produto", new Produto());
        return "produtos";
    }

    @GetMapping("/produtos/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Produto produto = produtoRepository.findById(id).orElse(null);

        if (produto == null) {
            return "redirect:/produtos";
        }

        model.addAttribute("produtos",  produtoRepository.findAll());
        model.addAttribute("produto", produto);

        return  "produtos";
    }

    @PostMapping("/produtos/atualizar")
    public String atualizar(Produto produto) {
        boolean validacaoNome =  produto.getNome() != null && !produto.getNome().trim().isEmpty();
        boolean validacaoDataValidade = !produto.getValidade().isBefore(LocalDate.now());
        boolean validacaoQuantidade = produto.getQuantidade() > 0;

        if(produto.getId() != null && validacaoNome && validacaoDataValidade && validacaoQuantidade){
            produtoRepository.save(produto);
        }

        return "redirect:/produtos";
    }

    @GetMapping("/produtos/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        produtoRepository.deleteById(id);
        return "redirect:/produtos";
    }
}