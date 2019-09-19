public class Cliente {

    public double getPercentualDesconto() {
        return 0d;
    }

    public double obterValorComDesconto (Pedido pedido){
        return pedido.obterValorBase();
    }
}