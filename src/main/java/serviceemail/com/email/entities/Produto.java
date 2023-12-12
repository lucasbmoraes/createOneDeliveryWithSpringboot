package serviceemail.com.email.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;

    @JsonIgnore
    @OneToMany(mappedBy = "produto")
    private List<Pedido> pedido;

    public Produto() {
    }
    public Produto(int id, String nome, List<Pedido> pedido) {
        this.id = id;
        this.nome = nome;
        this.pedido = pedido;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Pedido> getPedido() {
        return pedido;
    }
    public void setPedido(List<Pedido> pedido) {
        this.pedido = pedido;
    }

}