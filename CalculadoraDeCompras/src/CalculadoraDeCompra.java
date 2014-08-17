public class CalculadoraDeCompra {

	public CalculadoraDeCompra(IFrete frete, IDesconto desconto) {
	}

	public double calcula(Compra compra) {
		// compra.valor + frete(compra) - desconto(conta);

		return compra.getValor();
	}
}
