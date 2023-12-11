package serviceemail.com.email.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serviceemail.com.email.entities.Endereco;
import serviceemail.com.email.service.EnderecoService;

import java.util.List;

@RestController
@RequestMapping(value = "/endereco")
public class  EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @PostMapping("/cadastro")
    public void cadastroEndereco(Endereco endereco) {
        enderecoService.cadastro(endereco);
    }

    @GetMapping("/lista")
    public List<Endereco> getObject() {
        return enderecoService.getObject() ;
    }

    @DeleteMapping("/excluir/{id}")
    public void deletarEndereco(@PathVariable("id") int id) {
        enderecoService.deletarPedido(id);;
    }

}
