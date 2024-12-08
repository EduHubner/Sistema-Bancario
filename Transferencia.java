package trabalhoFinalPOO;

import java.time.LocalDate;

public class Transferencia {

	private LocalDate data;
	private double valor;
	
	public Transferencia() {
		
	}
	
	public Transferencia(double valor) {
		this.data = LocalDate.now();
		this.valor = valor;
		
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void Tranferir(Conta conta, double valor) {
		
		Transferencia trans = new Transferencia(valor);
		
		conta.setSaldo(conta.getSaldo() + valor);
		//conta.Tranferencias.add(trans);

	
	}
	
	public double PagarBoletoLeitura() {
		return 0;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transferencia [data=");
		builder.append(data);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
