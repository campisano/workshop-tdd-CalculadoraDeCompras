public class DescontoPorValor implements IDesconto {

	public double getValor(Compra compra) {

		double desconto;

		if (compra.getValor() <= 500) {
			desconto = compra.getValor() * 0.05;
		} else {
			desconto = compra.getValor() * 0.1;
		}

		return desconto;
	}
}
