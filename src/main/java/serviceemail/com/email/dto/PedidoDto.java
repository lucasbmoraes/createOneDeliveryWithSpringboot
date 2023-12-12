package serviceemail.com.email.dto;

import jakarta.persistence.*;
import serviceemail.com.email.entities.Produto;
import serviceemail.com.email.entities.Usuario;

import java.time.LocalDate;
import java.util.List;

public class PedidoDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate data;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    List<Produto> produto;
    @ManyToOne(cascade = CascadeType.ALL)
    private Usuario usuario;

    public PedidoDto() {
    }
    public PedidoDto(int id, LocalDate data, List<Produto> produto, Usuario usuario) {
        this.id = id;
        this.data = data;
        this.produto = produto;
        this.usuario = usuario;
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
    public List<Produto> getProdutos() {
        return produto;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produto = produtos;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
