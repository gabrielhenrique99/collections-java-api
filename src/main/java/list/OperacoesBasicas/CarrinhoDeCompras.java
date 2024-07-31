package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;

        // Verifica se a lista de itens está vazia
        if (itemList.isEmpty()) {
            System.out.println("O carrinho está vazio.");
            return valorTotal; // Retorna 0.0 se não há itens no carrinho
        }

        // Calcula o valor total dos itens no carrinho
        for (Item item : itemList) {
            valorTotal += item.calcularValorTotal();
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("A soma total de itens do carrinho é " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("Arroz", 5,2);
        carrinhoDeCompras.adicionarItem("Feijão", 6,2);
        System.out.println("A soma total de itens do carrinho é " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Arroz");
        System.out.println("A soma total de itens do carrinho é " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirItens();


    }
}
