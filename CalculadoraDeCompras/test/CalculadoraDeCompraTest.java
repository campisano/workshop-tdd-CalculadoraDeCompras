import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

// itens + frete - desconto
public class CalculadoraDeCompraTest {

	private CalculadoraDeCompra calc;
	private Compra compra;
	private IFrete frete;
	double valor;

	@Before
	public void before() {
		calc = null;
		frete = null;
		valor = 0;
	}

	@Test
	public void valorDeveSerSumaDosItens() {
		compra = new CompraBuilder().add(10).add(20).add(30).build();
		frete = Mockito.mock(IFrete.class);
		Mockito.when(frete.getValor(compra)).thenReturn(0.0);
		calc = new CalculadoraDeCompra(compra, frete);
		valor = calc.calcula();

		Assert.assertEquals(60.0, valor, 0.001);
	}

	@Test
	public void valorDeveAcrescentar01SeCompraMenor3ItensEClienteSP() {
		compra = new CompraBuilder().add(10).add(20).build();
		frete = new FreteBuilder().build("SP");
		calc = new CalculadoraDeCompra(compra, frete);
		valor = calc.calcula();

		Assert.assertEquals(30.0 * 1.1, valor, 0.001);
	}
}
