public class FreteSP implements IFrete {

	public double getValor(Compra compra) {
		double frete;

		if (compra.getNumItens() <= 3) {
			frete = 0.10;
		} else {
			frete = 0.17;
		}

		return compra.getValor() * frete;
	}
}
