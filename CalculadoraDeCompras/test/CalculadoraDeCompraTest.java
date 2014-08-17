import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// itens + frete - desconto
public class CalculadoraDeCompraTest {

	private CalculadoraDeCompra calc;
	private IFrete frete;
	private IDesconto desconto;
	private Compra compra;
	double valor;

	@Before
	public void before() {
		calc = new CalculadoraDeCompra(frete, desconto);
		valor = 0;
	}

	@Test
	public void valorDeveSumarOsItens() {
		compra = new CompraBuilder().add(10).add(20).add(30).build();

		valor = calc.calcula(compra);

		Assert.assertEquals(60.0, valor, 0.001);
	}
}
