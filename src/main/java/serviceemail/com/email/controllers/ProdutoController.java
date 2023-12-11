package serviceemail.com.email.controllers;
import org.springframework.web.bind.annotation.*;
import serviceemail.com.email.entities.Produto;
import serviceemail.com.email.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import serviceemail.com.email.service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    ProdutoService serviceProduto;

    @PostMapping("/cadastro")
    public void cadastroProduto(Produto produto) {
        serviceProduto.cadastro(produto);
    }

    @GetMapping("/lista")
    public List<Produto> listarProdutos() {
        return serviceProduto.listarProdutos();
    }

    @DeleteMapping("/excluir/{id}")
    public void deletaProduto(@PathVariable("id") int id) {
        serviceProduto.excluirProduto(id);
    }
}
