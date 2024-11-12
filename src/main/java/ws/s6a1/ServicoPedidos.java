package ws.s6a1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface ServicoPedidos {
    @WebMethod
    String adicionarPedido(String nomeCliente,
                            String produto,
                           int quantidade);
    @WebMethod
    List<String> listaPedidos();
    @WebMethod
    String getDetalhesPedido(int idPedido);
}
