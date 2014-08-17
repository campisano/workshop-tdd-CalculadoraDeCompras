import java.util.List;

public class Compra {

	private Cliente cliente;
	private List<Item> items;

	public Compra(Cliente cliente, List<Item> items) {
		this.cliente = cliente;
		this.items = items;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getValor() {
		double valor = 0;

		for (Item item : items) {
			valor += item.getValor();
		}

		return valor;
	}
}
