
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();				// instanciado com o construtor sem parametros
		gerente.setSenha(1234);							// metodo da classe Gerente
		gerente.setSalario(5000);						// setter herdado da classe Funcionario
		
		System.out.println(gerente.autentica(1234));
		System.out.println(gerente.getBonificacao());
		
	}
}
