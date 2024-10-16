package entities;

import java.util.ArrayList;

public class Question7Part2 {
    private ArrayList<Question7> itens = new ArrayList<>();

    public Question7Part2() {}

    public void inserirItem(Question7 produto) {
        itens.add(produto);
    }

    public double totalCarrinho() {
        double total = 0;
        for (Question7 produto : itens) {
            total += produto.getPreco();  // Usa o loop para calcular o total
        }
        return total;
    }

    public ArrayList<Question7> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Question7> itens) {
        this.itens = itens;
    }
}
