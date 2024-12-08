package trabalhoFinalPOO;

import java.util.List;

public class Conta {
	
	private double saldo;
	private int numConta;
	private int agencia;
	protected Usuario usuario;
	protected List<Transferencia> Tranferencias;
	protected Cartao cartao;
	
	public Conta() {
		this.saldo = 0;
	}
	
	public Conta(int numConta, int agencia, Usuario usuario) {
		this.saldo = 0;
		this.numConta = numConta;
		this.agencia = agencia;
		this.usuario = usuario;
	}
	
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
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [saldo=");
		builder.append(saldo);
		builder.append(", numConta=");
		builder.append(numConta);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", usuario=");
		builder.append(usuario);
		builder.append(", Tranferencias=");
		builder.append(Tranferencias);
		builder.append(", cartao=");
		builder.append(cartao);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
