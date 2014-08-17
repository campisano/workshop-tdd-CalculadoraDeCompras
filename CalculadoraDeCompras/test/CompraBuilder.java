import java.util.ArrayList;
import java.util.List;

public class CompraBuilder {

	private List<Item> items;

	public CompraBuilder() {
		items = new ArrayList<Item>();
	}

	public CompraBuilder add(int valor) {
		items.add(new Item(valor));

		return this;
	}

	public Compra build() {
		return new Compra(items);
	}
}
