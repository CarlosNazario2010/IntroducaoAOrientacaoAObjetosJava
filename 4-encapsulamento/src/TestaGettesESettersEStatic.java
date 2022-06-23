
public class TestaGettesESettersEStatic {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(4429, 123456); 		// conta ja recebe os parametros agencia e numero
													// determinados pelo construtor da classe
		
		// conta.setAgencia(4429);					// os atributos da conta sao atribuidos atraves dos setters
		// conta.setNumero(123456);					// caso a classe nao tenha um construtor que receba 
													// esses parametros
		
		// 	conta.agencia = 4429; 					// como os atributos agencia e numero sao privados 
		//	conta.numero = 123456; 					// nao podem ser modificados fora dos setters

		System.out.println(conta.getAgencia());		// os getters informam os valores
		System.out.println(conta.getNumero());		// dos atributos privados
		
		Cliente cliente = new Cliente();			// instancia um novo cliente

		cliente.setNome("Carlos");					// popula os atributos do cliente
		cliente.setCpf("007.329.620-13");			// com os setters
		cliente.setProfissao("Bancario");
		
		conta.setTitular(cliente);
		
		System.out.println(conta.getTitular().getNome());		// pega os atributos do titular da conta
		System.out.println(conta.getTitular().getCpf());		// com os getters. A classe Conta possui
		System.out.println(conta.getTitular().getProfissao());	// o getter getTitular() que referencia
																// a classe Cliente que possui o getters
																// dos atributos do cliente
	
					// para alterar a profissao se utiliza o setter
		conta.getTitular().setProfissao("Programador");
		
					// para pegar a nova profissao se utiliza o getter
		System.out.println(conta.getTitular().getProfissao());
		
					// instancia uma nova conta e atualiza o atributo estatico total
		Conta conta2 = new Conta(3240, 654321);
		
		System.out.println(conta2.getAgencia());
		System.out.println(conta2.getNumero());
		
		System.out.println(Conta.getTotalDeContas()); 	// getter que informa o 
														// total de contas criadas
	}
}
