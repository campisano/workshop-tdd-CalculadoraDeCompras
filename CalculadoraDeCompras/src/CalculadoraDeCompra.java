public class CalculadoraDeCompra {

	private Compra compra;
	private IFrete frete;
	private IDesconto desconto;

	public CalculadoraDeCompra(Compra compra, IFrete frete, IDesconto desconto) {
		this.compra = compra;
		this.frete = frete;
		this.desconto = desconto;
	}

	public double calcula() {
		return compra.getValor() + frete.getValor(compra)
				- desconto.getValor(compra);
	}
}
