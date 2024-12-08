package trabalhoFinalPOO;

public class Main {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario(123, "Carlos", "123.456.799-87");
		
		System.out.println(user1);
		
		Conta conta1 = new Conta(999999, 123465, user1);
		
		System.out.println(conta1);
		
		Transferencia trandas = new Transferencia();
		
		trandas.Tranferir(conta1, 1000);
		
		System.out.println(conta1);
	}

}
