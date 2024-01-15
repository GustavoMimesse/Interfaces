package Agregação;

public class Vendedor {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private double comissao;

    public double getComissão() {
        return comissao;
    }

    public void setComissão(double comissao) {
        this.comissao = comissao;
    }

    public void vende () {
        System.out.println("Vender");

    }
}
