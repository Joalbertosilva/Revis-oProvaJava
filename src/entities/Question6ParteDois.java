package entities;

import java.util.ArrayList;

public class Question6ParteDois {
    private ArrayList<Question6> itens = new ArrayList<>();

    public Question6ParteDois() {}

    public void inserirItem(Question6 produto) {
        itens.add(produto);
    }

    public double totalCarrinho() {
        double total = 0;
        for (Question6 produto : itens) {
            total += produto.getPreco();  // Usa o loop para calcular o total
        }
        return total;
    }

    public ArrayList<Question6> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Question6> itens) {
        this.itens = itens;
    }
}
