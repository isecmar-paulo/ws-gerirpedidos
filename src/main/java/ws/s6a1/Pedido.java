package ws.s6a1;

public class Pedido {
    private final int idPedido;
    private final String nomeCliente;
    private final String produto;
    private final int quantidade;

    public Pedido(int idPedido, String nomeCliente, String produto, int quantidade) {
        this.idPedido = idPedido;
        this.nomeCliente = nomeCliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
