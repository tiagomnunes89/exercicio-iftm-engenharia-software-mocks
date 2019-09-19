import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<LinhaPedido> linhaPedidoList = new ArrayList<>();
    private Double precoPedido;
    private Cliente cliente;

    public Pedido(List<LinhaPedido> linhaPedidoList, Double precoPedido, Cliente cliente) {
        this.linhaPedidoList = linhaPedidoList;
        this.precoPedido = precoPedido;
        this.cliente = cliente;
    }

    public List<LinhaPedido> getLinhaPedidoList() {
        return linhaPedidoList;
    }

    public double getValorPedido() {
        return 0d;
    }

    public double calcularPreco() {
        for(LinhaPedido item : linhaPedidoList){
            precoPedido += item.calcularPreco();
        }
        return cliente.obterValorComDesconto(this);
    }

    public double obterValorBase() {
        return precoPedido;
    }
}