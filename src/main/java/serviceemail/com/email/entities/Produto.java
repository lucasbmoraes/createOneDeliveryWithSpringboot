package serviceemail.com.email.entities;

import jakarta.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @ManyToOne(cascade = CascadeType.ALL)
    private Pedido pedido;
    private int preco;

    public Produto() {
    }
    public Produto(int id, String nome, Pedido pedido, int preco) {
        this.id = id;
        this.nome = nome;
        this.pedido = pedido;
        this.preco = preco;
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
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

}