package ws.s6a1;

import jakarta.xml.ws.Endpoint;

public class ServicoPedidoPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ServicoPedido",
                new ServicoPedidosImpl());
        System.out.println("Serviço pedidos a rodar " +
                "em http://localhost:8080/ServicoPedido?wsdl");
    }
}
