package serviceemail.com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import serviceemail.com.email.entities.Endereco;
import serviceemail.com.email.repository.EnderecoRepository;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepository enderecoRepository;

    public void cadastro(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public List<Endereco> getObject() {
        return enderecoRepository.findAll();
    }

    public void deletarPedido(int id) {
        enderecoRepository.deleteById(id);
    }
}
