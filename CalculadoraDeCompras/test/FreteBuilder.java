public class FreteBuilder {

	public IFrete build(String estado_destino) {
		if (estado_destino == "SP") {
			return new FreteSP();
		} else if (estado_destino == "RJ") {
			return new FreteRJ();
		} else if (estado_destino == "Sul do país") {
			return new FreteSUL();
		} else {
			return new FreteRestante();
		}
	}
}
