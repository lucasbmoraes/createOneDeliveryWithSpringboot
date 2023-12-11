package serviceemail.com.email.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serviceemail.com.email.service.FormaPagamentoService;
import serviceemail.com.email.entities.FormaPagamento;
import java.util.List;

@RestController
@RequestMapping(value = "/formaPagamento")
public class FormaPagamentoController {

    @Autowired
     FormaPagamentoService serviceFormaPagamento;

    @PostMapping("/cadastro")
    public void cadastroFormaPagamento(FormaPagamento formaPagamento) {
        serviceFormaPagamento.cadastro(formaPagamento);
    }

    @GetMapping("/lista")
    public List<serviceemail.com.email.entities.FormaPagamento> getObject() {
        return serviceFormaPagamento.getObject();
    }

    @DeleteMapping("/excluir/{id}")
    public void deletarPedido(@PathVariable("id") int id) {
        serviceFormaPagamento.deletarPedido(id);;
    }
}
