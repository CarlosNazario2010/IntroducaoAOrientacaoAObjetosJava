
public class TestaConta {

	public static void main(String[] args) {
		
		Cliente carlos = new Cliente();
		carlos.nome = "Carlos Eduardo Nazario";
		carlos.cpf = "007.329.620-13";
		carlos.profissao = "Bancario";
		
		Conta contaDoCarlos = new Conta();
		contaDoCarlos.numero = 123456;
		contaDoCarlos.deposita(100);
		
		contaDoCarlos.titular = carlos;		// o atributo titular da classe Conta aqui instanciada
											// recebe o cliente instanciado com a classe Cliente
											// atributo titular aponta para o objeto Cliente
											// em suma, o ponto (.) navega entre os apontadores de 
											// atributos e metodos
		
				// Conta possui > o atributo titular que referencia > 
				// a classe Cliente que possui > o atributo nome/cpf
		System.out.println(contaDoCarlos.titular.nome);
		System.out.println(contaDoCarlos.titular.cpf);
		
		System.out.println(contaDoCarlos.numero);
		// System.out.println(contaDoCarlos.saldo);		// saldo agora é atributo privado
		System.out.println(contaDoCarlos.getSaldo());	// precisa se chamado pelo getter
		
				// ambas as variaveis, carlos e contaDoCarlos.titular, apontam para o mesmo 
				// endereco de memoria, o que indica que sao identicas
		System.out.println(carlos);
		System.out.println(contaDoCarlos.titular);
		System.out.println((carlos == contaDoCarlos.titular));
		
				// se tentado referenciar um atributo de um objeto que nao foi instanciado
				// (no caso, cliente nao foi instanciado) lancara um exception informando 
				// que o atributo titular da classe Conta é nulo (NullPointerException)
		Conta contaDoPaulo = new Conta();
		System.out.println(contaDoPaulo.titular);	// objeto nulo
		
		// System.out.println(contaDoPaulo.titular.nome);	// NullPointerException
		
				// agora sim instanciando um objeto Cliente no atributo titular de Conta
				// podemos referenciar o atributo nome do objeto Cliente 
		contaDoPaulo.titular = new Cliente();
		System.out.println(contaDoPaulo.titular);
		contaDoPaulo.titular.nome = "Paulo Silveira";		// objeto referenciado
		System.out.println(contaDoPaulo.titular.nome);
	}
}
