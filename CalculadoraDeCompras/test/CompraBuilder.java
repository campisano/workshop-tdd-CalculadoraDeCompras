import java.util.ArrayList;
import java.util.List;

public class CompraBuilder {

	private Cliente cliente;
	private List<Item> items;

	public CompraBuilder() {
		init("?");
	}

	public CompraBuilder(String estado) {
		init(estado);
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
