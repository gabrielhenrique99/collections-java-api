package main.java.list.OperacoesBasicas;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Nome = '" + nome + '\'' +
                ", preco = " + preco +
                ", quantidade = " + quantidade +
                ", valor total = " + calcularValorTotal();
    }
}
