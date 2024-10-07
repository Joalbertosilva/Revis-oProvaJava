package entities;

import java.sql.Date;

public class Question6 {
    private String nome;
    private double preco;
    private Date dataValidade;


    public Question6(String nome, double preco, Date dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }


    public Question6(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = null;  // Sem validade
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
