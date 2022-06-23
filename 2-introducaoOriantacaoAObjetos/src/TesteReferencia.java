
public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta(); 		// Na verdade a primeiraConta nao é um objeto do tipo conta
												// Mas sim uma referencia (ele aponta) para o endereco de memoria
		primeiraConta.saldo = 300;				// daquele objeto	
		
		System.out.println("Saldo primeiraConta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; 	// no caso, a referencia segundaConta tambem aponta para o 
												// mesmo endereco de memoria que a primeiraConta aponta
		
		System.out.println("Saldo segundaConta: " + segundaConta.saldo); 	// segunda conta nao possui o atributo saldo
																			// com valor default: 0
		
		segundaConta.saldo += 100; 				// como as duas referencias apontam para o mesmo objeto
												// o atributo é atualizado nas duas variaveis
		
		System.out.println("Saldo segundaConta: " + segundaConta.saldo);
		System.out.println("Saldo primeiraConta: " + primeiraConta.saldo);
		System.out.println();
		
		if (primeiraConta == segundaConta) {
			System.out.println("Endereco de memoria da primeiraConta: " + primeiraConta);
			System.out.println("Endereco de memoria da primeiraConta: " + segundaConta);
			System.out.println("A primeiraConta e a segundaConta sao as mesmas. Nao ha duas contas");
			System.out.println();
		}
		
		Conta terceiraConta = new Conta();		// terceiraConta ai sim referencia um novo endereco de memoria
		
		System.out.println("Endereco de memoria da primeiraConta: " + primeiraConta);
		System.out.println("Endereco de memoria da primeiraConta: " + terceiraConta);
		System.out.println("A primeiraConta e a terceiraConta sao contas diferentes");

	}
}
