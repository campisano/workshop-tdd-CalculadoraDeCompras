public class CalculadoraDeCompra {

	private Compra compra;
	private IFrete frete;

	public CalculadoraDeCompra(Compra compra, IFrete frete) {
		this.compra = compra;
		this.frete = frete;
	}

	public double calcula() {
		// compra.valor + frete(compra) - desconto(conta);

		return compra.getValor() + frete.getValor(compra);
	}
}
