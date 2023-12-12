package serviceemail.com.email.service;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import serviceemail.com.email.entities.Email;
import serviceemail.com.email.entities.Pedido;
import serviceemail.com.email.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    EmailService serviceEmail;


    public void cadastro(Pedido pedido, Email email) {
        pedido.setData(LocalDate.now());
        pedidoRepository.save(pedido);
        serviceEmail.sendEmail(email, pedido);
    }

    public List<Pedido> getObject() {
        return pedidoRepository.findAll();
    }

    public void deletarPedido(int id) {
        pedidoRepository.deleteById(id);
    }

}