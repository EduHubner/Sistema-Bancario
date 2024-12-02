package trabalhoFinalPOO;

import java.util.List;

public class Conta {
	
	private double saldo;
	private int numConta;
	private int agencia;
	protected Usuario usuario;
	protected List<Transferencia> Tranferencias;
	protected Cartao cartao;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
