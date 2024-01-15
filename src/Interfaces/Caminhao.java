package Interfaces;

public class Caminhao implements ICarro {
    @Override
    public void andar() {
        System.out.println("Carro está andando devagar");
    }

    @Override
    public void parar() {
        System.out.println("Caminhão está parando");
    }
}
