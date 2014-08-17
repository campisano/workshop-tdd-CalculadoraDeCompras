public class FreteRJ implements IFrete {
	public double getValor(Compra compra) {
		double frete;

		if (compra.getNumItens() <= 4) {
			frete = 0.11;
		} else {
			frete = 0.15;
		}

		return compra.getValor() * frete;
	}
}
