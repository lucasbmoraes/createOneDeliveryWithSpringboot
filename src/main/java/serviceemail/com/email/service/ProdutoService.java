package serviceemail.com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import serviceemail.com.email.entities.Pedido;
import serviceemail.com.email.entities.Produto;
import serviceemail.com.email.repository.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public void cadastro(Produto produto) {
        produtoRepository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscaProdutoPorId(int id) {
        return produtoRepository.findById(id).get();
    }

    public void excluirProduto(@PathVariable("id") int id){
        produtoRepository.deleteById(id);
    }
}
