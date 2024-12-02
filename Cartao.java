package trabalhoFinalPOO;

import java.util.Date;

public class Cartao {

	private int numCartao;
	private int CVV;
	private Date validade;
	
	public int getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public double Pagar() {
		return 0;
	}
	
	public double PagarFatura() {
		return 0;
	}
}
