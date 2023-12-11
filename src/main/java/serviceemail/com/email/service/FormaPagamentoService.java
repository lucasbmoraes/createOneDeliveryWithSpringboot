package serviceemail.com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serviceemail.com.email.entities.FormaPagamento;
import serviceemail.com.email.repository.FormaPagamentoRepository;

import java.util.List;

@Service
public class FormaPagamentoService {

    @Autowired
    FormaPagamentoRepository formaPagamentoRepository;

    public void cadastro(FormaPagamento formaPagamento) {
        formaPagamentoRepository.save(formaPagamento);
    }

    public List<FormaPagamento> getObject() {
        return formaPagamentoRepository.findAll();
    }

    public void deletarPedido(int id) {
        formaPagamentoRepository.deleteById(id);
    }
}
