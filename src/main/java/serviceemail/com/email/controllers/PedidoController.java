package serviceemail.com.email.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import serviceemail.com.email.entities.Email;
import serviceemail.com.email.entities.Pedido;
import serviceemail.com.email.service.EmailService;
import serviceemail.com.email.service.PedidoService;

import java.util.List;


@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {
    @Autowired
    PedidoService servicePedido;

    @PostMapping("/cadastro")
    public void cadastroPedido(Pedido pedido) {
        servicePedido.cadastro(pedido);
    }

    @GetMapping("/lista")
    public List<Pedido> getObject() {
        return servicePedido.getObject() ;
    }

    @DeleteMapping("/excluir/{id}")
    public void deletarPedido(@PathVariable("id") int id) {
        servicePedido.deletarPedido(id);;
    }
}
