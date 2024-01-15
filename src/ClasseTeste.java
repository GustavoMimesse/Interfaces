import Interfaces.*;

public class ClasseTeste {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Gustavo");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new CanetaEsferografica();
        giz.escrever("Olá Gustavo");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());

        Lapis lapis = new Lapis();
        lapis.escrever("Olá Gustavo");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }

}
