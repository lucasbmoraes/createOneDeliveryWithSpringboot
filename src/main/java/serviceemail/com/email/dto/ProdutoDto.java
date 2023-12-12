package serviceemail.com.email.dto;

import jakarta.persistence.*;
import serviceemail.com.email.entities.Pedido;

public class ProdutoDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @ManyToOne(cascade = CascadeType.ALL)
    private Pedido pedido;
    private int preco;
    private int quantidade;

    public ProdutoDto() {
    }
    public ProdutoDto(int id, String nome, Pedido pedido, int preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.pedido = pedido;
        this.preco = preco;
        this.quantidade = quantidade;
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
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
