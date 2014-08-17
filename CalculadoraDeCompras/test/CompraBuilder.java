import java.util.ArrayList;
import java.util.List;

public class CompraBuilder {

	private Cliente cliente;
	private List<Item> items;

	public CompraBuilder() {
		init("estado... pode morar em qualquer lugar, dessa forma ter uma interface de frete faz mais sentido");
	}

	private void init(String estado) {
		cliente = new Cliente(estado);
		items = new ArrayList<Item>();
	}

	public CompraBuilder add(int valor) {
		items.add(new Item(valor));

		return this;
	}

	public Compra build() {
		return new Compra(cliente, items);
	}
}
