public class Casa extends Imovel {
	private double adicional = 3333333;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	public void imprimeDadosCasa() {
		System.out.println("*****Tipo de Imovel CASA******");
		System.out.println("Rua Pedro Krauss, 99 - Velha Central - Blumenau/SC");
		System.out.println("Preco Imovel R$ "+ (getPreco()+getAdicional()));
	}

}
