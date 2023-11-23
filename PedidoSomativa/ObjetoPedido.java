package PedidoSomativa;

public class ObjetoPedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1, "bolacha", 2);
		
		System.out.println("Id: " + pedido.getId());
		System.out.println("Produto: " + pedido.getProduto());
		System.out.println("Quantidade: " + pedido.getQuantidade());

	}

}
