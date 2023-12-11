package serviceemail.com.email.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serviceemail.com.email.entities.Usuario;
import serviceemail.com.email.service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public void cadastroUsuario(Usuario usuario) {
        usuarioService.cadastroUsuario(usuario);
    }

    @GetMapping("/lista")
    public List<Usuario> listaUsuarios() {
        return usuarioService.listaUsuarios();
    }

    @DeleteMapping("/deletarUsuario/{id}")
    public void deletarUsuario(@PathVariable("id") int id) {
        usuarioService.deletarUsuario(id);
    }
}
