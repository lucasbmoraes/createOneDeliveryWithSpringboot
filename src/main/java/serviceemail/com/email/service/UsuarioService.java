package serviceemail.com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;
import serviceemail.com.email.entities.Usuario;
import serviceemail.com.email.repository.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;
    public void cadastroUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    public List<Usuario> listaUsuarios() {
        return usuarioRepository.findAll();
    }
    public void deletarUsuario(@PathVariable("id") int id) {
        usuarioRepository.deleteById(id);
    }
}

