import java.util.List;

public class Compra {

	private List<Item> items;

	public Compra(List<Item> items) {
		this.items = items;
	}

	public double getValor() {
		double valor = 0;

		for (Item item : items) {
			valor += item.getValor();
		}

		return valor;
	}
}
