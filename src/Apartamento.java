public class Apartamento extends Imovel {
	private double desconto = 666666666;

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public void imprimeDadosApto() {
		System.out.println("*****Tipoo de Imovel - APARTAMENTO");
		System.out.println("Rua Gustavo Frank, 394 - Velha Central - Blumenau/SC");
		System.out.println("Valor Total do Imovel R$"+ (getPreco() - getDesconto()));
	}
}
