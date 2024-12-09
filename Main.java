package trabalhoFinalPOO;

public class Main {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario(123, "Carlos", "123.456.799-87");
		
		System.out.println(user1);
		
		Usuario user2 = new Usuario(321, "ROger", "987.654.654-15");
		
		System.out.println(user2);
		
		Conta conta1 = new Conta(999999, 123465, user1);
		
		System.out.println(conta1);
		
		Conta conta2 = new Conta(88888, 1265, user2);
		
		System.out.println(conta2);
		
		
		
		Transferencia trandas = new Transferencia(1000);
		Transferencia t2 = new Transferencia(5000);
		
		trandas.Tranferir(conta1, conta2);
		t2.Tranferir(conta2, conta1);
		
		
		System.out.println(conta1);
		System.out.println(conta2);
		
		System.out.println("\nTranferencias da Conta 1: \n" + conta1.Tranferencias);
		
	}

}
