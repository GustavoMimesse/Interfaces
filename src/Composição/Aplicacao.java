package Composição;

public class Aplicacao {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.setCodigo(10);
        banco.setNome("Banco Mimesse");

        ContaCorrente cc = new ContaCorrente();
        cc.setBanco(banco);
        cc.setSaldo(10d);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setBanco(banco);
        cp.setSaldo(10d);

        banco.add(cc);
        banco.add(cp);
    }
}
