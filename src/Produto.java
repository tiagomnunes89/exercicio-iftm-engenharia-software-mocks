public class Produto {

    private Double valorProduto;

    public Produto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double obterPreco (int quantidade){
        return quantidade * valorProduto;
    }
}
