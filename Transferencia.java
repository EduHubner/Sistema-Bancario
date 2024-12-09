package trabalhoFinalPOO;

import java.time.LocalDate;

public class Transferencia {

	private LocalDate data;
	private double valor;
	
	public Transferencia() {
		this.data = LocalDate.now();
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
	
	public void Tranferir(Conta contaPaga, Conta contaRecebe) {
		
		contaPaga.setSaldo(contaPaga.getSaldo() - this.valor);
		contaRecebe.setSaldo(contaRecebe.getSaldo() + this.valor);
		contaPaga.addTransferencia(this);
		contaRecebe.addTransferencia(this);

	
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
		builder.append("]");
		return builder.toString();
	}
	
	
}
