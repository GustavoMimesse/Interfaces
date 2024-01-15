package Agregação;

public class Programa {
    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, 10d, "TV");
        Produto produtoCel = criarProduto(12L, 1000d, "Celular");

        Vendedor vendedor = criarVendedor("Rodrigo", 10d);

        Comprador comprador = criarComprador();

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);
    }

    private static Comprador criarComprador() {
        return new Comprador("Teste", 2000.0);
    }


    private static Vendedor criarVendedor(String nome, double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissão(comissao);
        vendedor.setNome(nome);
        return vendedor;
    }

    public static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(11);
        produto.setPreco(100d);
        produto.setNome(nome);
        return produto;
    }
}



