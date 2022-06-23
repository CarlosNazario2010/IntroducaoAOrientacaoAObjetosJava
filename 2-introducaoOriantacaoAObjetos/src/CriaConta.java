
public class CriaConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();							// instancia um objeto do tipo Conta
		conta1.saldo = 200;									// atributo saldo da instancia conta1 recebe 200
		System.out.println("Saldo conta1: " + conta1.saldo);
															// inicializacao de valores default da classe
		System.out.println("Agencia conta1 (default): " + conta1.agencia);
		System.out.println("Banco conta1 (default: 104): " + conta1.banco);
		
		int deposito = 100;									// atributos de objetos podem ser manipulados
		conta1.saldo += deposito;								
		System.out.println("Saldo conta1 apos deposito de 100 reais: " + conta1.saldo);
		
		Conta conta2 = new Conta();							// nova instancia de um objeto do tipo Conta
		conta2.saldo = 50;
		System.out.println("Saldo conta2: " + conta2.saldo);
	}
}
