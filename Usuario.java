package trabalhoFinalPOO;

public class Usuario {

	private int idUsuario;
	private String nome;
	private String CPF;
	
	public Usuario() {
		
	}
	
	public Usuario(int idUsuario, String nome, String cPF) {
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.CPF = cPF;
	}
	
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [idUsuario=");
		builder.append(idUsuario);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", CPF=");
		builder.append(CPF);
		builder.append("]");
		return builder.toString();
	}
	
	
}
