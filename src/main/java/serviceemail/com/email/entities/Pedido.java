package serviceemail.com.email.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate data;

    @ManyToOne(cascade = CascadeType.ALL)
    private Produto produto;

    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario;

    private int quantidade;

    public Pedido() {
    }
    public Pedido(int id, LocalDate data, Produto produto, Usuario usuario, int quantidade) {
        this.id = id;
        this.data = data;
        this.produto = produto;
        this.usuario = usuario;
        this.quantidade = quantidade;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}