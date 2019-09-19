public class LinhaPedido {

    private Produto produto;
    private int quantidade;

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularPreco() {
        return produto.obterPreco(quantidade);
    }
}
