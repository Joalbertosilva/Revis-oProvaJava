package entities;

import java.util.ArrayList;

public class Question3 {
    private ArrayList<String> listaProduto;

    public Question3(){
        this.listaProduto = new ArrayList<>();
    }

    public ArrayList<String> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(ArrayList<String> listaProduto) {
        this.listaProduto = listaProduto;
    }

    public void adicionarItem(String item){
        this.listaProduto.add(item);
    }
    public ArrayList<String> exibirLista(){
        return listaProduto;
    }
}
