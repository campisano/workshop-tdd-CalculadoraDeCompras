public class FreteBuilder {

	public IFrete build(String estado_destino) {
		if (estado_destino == "SP") {
			return new FreteSP();
		}

		return null;
	}

}
