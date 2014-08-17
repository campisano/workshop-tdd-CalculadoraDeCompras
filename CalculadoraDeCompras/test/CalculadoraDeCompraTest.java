import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

// itens + frete - desconto
public class CalculadoraDeCompraTest {

	private CalculadoraDeCompra calc;
	private Compra compra;
	private IFrete frete;
	private IDesconto desconto;
	double valor;

	@Before
	public void before() {
		calc = null;
		frete = Mockito.mock(IFrete.class);
		Mockito.when(frete.getValor(compra)).thenReturn(0.0);
		desconto = Mockito.mock(IDesconto.class);
		Mockito.when(desconto.getValor(compra)).thenReturn(0.0);
		valor = 0;
	}

	@Test
	public void valorDeveSerSumaDosItens() {
		compra = new CompraBuilder().add(10).add(20).add(30).build();
		calc = new CalculadoraDeCompra(compra, frete, desconto);
		valor = calc.calcula();

		Assert.assertEquals(60.0, valor, 0.001);
	}

	@Test
	public void valorDeveAcrescentar010SeCompraMenor3ItensEClienteSP() {
		compra = new CompraBuilder().add(10).add(20).build();
		frete = new FreteBuilder().build("SP");
		calc = new CalculadoraDeCompra(compra, frete, desconto);
		valor = calc.calcula();

		Assert.assertEquals(30.0 * 1.10, valor, 0.001);
	}

	@Test
	public void valorDeveSubtrair005ParaItensAte500() {
		compra = new CompraBuilder().add(1).add(498).build();
		desconto = new DescontoPorValor();
		calc = new CalculadoraDeCompra(compra, frete, desconto);
		valor = calc.calcula();

		Assert.assertEquals(499.0 * 0.95, valor, 0.001);
	}

	@Test
	public void valorDeveSubtrair005Para500Itens() {
		compra = new CompraBuilder().add(1).add(498).add(1).build();
		desconto = new DescontoPorValor();
		calc = new CalculadoraDeCompra(compra, frete, desconto);
		valor = calc.calcula();

		Assert.assertEquals(500.0 * 0.95, valor, 0.001);
	}

	@Test
	public void valorDeveSubtrair010ParaMaisQue500Itens() {
		compra = new CompraBuilder().add(500).add(1).build();
		desconto = new DescontoPorValor();
		calc = new CalculadoraDeCompra(compra, frete, desconto);
		valor = calc.calcula();

		Assert.assertEquals(501.0 * 0.90, valor, 0.001);
	}
}
