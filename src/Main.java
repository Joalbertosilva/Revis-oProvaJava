import entities.Question7;
import entities.Question7Part2;

public class Main {
    public static void main(String[] args) {

        Question7Part2 carrinho = new Question7Part2();

        Question7 leite = new Question7("Leite", 3.5);  // Produto sem validade
        Question7 banana = new Question7("Banana", 2.0);  // Produto sem validade

        carrinho.inserirItem(leite);
        carrinho.inserirItem(banana);

        double total = carrinho.totalCarrinho();
        System.out.println("O valor total do carrinho é: R$" + total);
    }
}
