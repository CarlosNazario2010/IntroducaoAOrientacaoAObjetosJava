
public class TestaMetodosDaConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		System.out.println("Deposito de 100 reais na conta1"); 
		
		conta1.deposita(100);									// deposita é metodo da classe conta		
		System.out.println("Saldo conta1: " + conta1.saldo);
		System.out.println("Saque de 50 reais da conta1'");
		
		boolean conseguiuSacar = conta1.saca(50);				// metodo saca retorna um booleano que pode ser referenciado
		System.out.println("Saldo conta1: " + conta1.saldo);	// por uma variavel do tipo boolean
		System.out.println("Conseguiu sacar? " + conseguiuSacar);
		
		System.out.println("Tentativa de saque de 200 reais da conta 1 "
				+ "que possui apenas 50 reais");
		
		conseguiuSacar = conta1.saca(200);						// metodo saca retorna um booleano que pode ser referenciado
		System.out.println("Saldo conta1: " + conta1.saldo);	// por uma variavel do tipo boolean
		System.out.println("Conseguiu sacar? " + conseguiuSacar);
		
		System.out.println("transferencia de 50 reais da conta1 para a conta2");
		
		System.out.println("Saldo conta1: " + conta1.saldo + ", "
				+ "Saldo conta2: " + conta2.saldo);
		
		boolean sucessoTransferencia = conta1.transfere(50, conta2); 	// resultado do metodo devolve um booleano 
		if (sucessoTransferencia) { 							
			System.out.println("Transferencia realizada com sucesso.");
		}
		System.out.println("Saldo conta1: " + conta1.saldo + 
				", Saldo conta2: " + conta2.saldo);
		
		System.out.println("Tentativa de transferencia de 100 reais da "
				+ "conta1 (que possui 50 reais) para a conta2");
		
		System.out.println("Saldo conta1: " + conta1.saldo + 
				", Saldo conta2: " + conta2.saldo);
		
		boolean conseguiuTransferir = conta1.transfere(100, conta2);
		System.out.println("Saldo conta1: " + conta1.saldo + 
				", Saldo conta2: " + conta2.saldo);
		
		System.out.println("Conseguiu transferir? " + conseguiuTransferir);	
	}
}
