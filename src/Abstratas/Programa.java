package Abstratas;

public class Programa {
    public static void main(String[] args) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Gustavo");
        empregado.setSobrenome("Mimesse");
        empregado.setSalario(100d);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("1");
        comissionado.setNome("Gustavo2");
        comissionado.setSobrenome("Mimesse");
        comissionado.setTotalVenda(1000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("23");
        horista.setNome("Gustavo23");
        horista.setSobrenome("Mimesse");
        horista.setPrecoHora(100d);
        horista.setTotalHoraTrabalhada(60d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        if (empregado instanceof Horista) {
            Horista hor = (Horista) empregado;
            System.out.println(hor.getPrecoHora());

        }
        System.out.println(empregado.getNome() + " Tem salário: " + empregado.vecimento());
    }
}
