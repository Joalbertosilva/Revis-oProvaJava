import entities.Question6;
import entities.Question6ParteDois;

public class Main {
    public static void main(String[] args) {

        Question6ParteDois carrinho = new Question6ParteDois();

        Question6 leite = new Question6("Leite", 3.5);  // Produto sem validade
        Question6 banana = new Question6("Banana", 2.0);  // Produto sem validade

        carrinho.inserirItem(leite);
        carrinho.inserirItem(banana);

        double total = carrinho.totalCarrinho();
        System.out.println("O valor total do carrinho é: R$" + total);
    }
}
