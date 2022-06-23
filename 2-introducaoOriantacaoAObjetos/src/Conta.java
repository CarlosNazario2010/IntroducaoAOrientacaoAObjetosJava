
public class Conta {     						// cria a classe conta
	
	int banco = 104;
	double saldo;
	int agencia = 4429;							// objetos do tipo conta possuem quatro atributos
	int numero;
	String titular;
	
	
	public void deposita(double valor) {		// metodo deposita dos objetos do tipo conta. valor é o argumento do metodo
		this.saldo += valor;					// this referencia os atributos da classe. void informa que nao ha retorno 
	}
	
	public boolean saca(double valor) {			// boolean no comeco do metodo informa que sera retornado um booleano	
		if (this.saldo >= valor) {				// se o saldo da conta for maior que o valor do saque				
			this.saldo -= valor;				// diminui o valor do saque do saldo total da conta
			return true;						// return retorna o o booleno. Aqui no caso de sucesso
		}
		return false;							// Aqui no caso de fracasso
	}
	
	public boolean transfere(double valor, Conta conta) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;				// mesmo que >>> this.saca(valor);
			conta.saldo += valor; 				// mesmo que >>> conta.deposita(valor);
			return true;
		}
		return false;
	}
}
