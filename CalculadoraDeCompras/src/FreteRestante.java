public class FreteRestante implements IFrete {

	public double getValor(Compra compra) {
		return compra.getValor() * 0.25;
	}
}
