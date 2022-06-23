
public class Conta {     	// cria a classe conta
	
	int banco = 104;
	private double saldo;	// private informa que o atributo saldo � privado
							// so pode ser acessado dentro da classe Conta
							// o atributo nao pode ser lido e nem modificado fora da classe
							// o atributo esta encapsulado
	int agencia;		
	int numero;
	Cliente titular;		// atributo titular � instancia da classe Cliente
	
	
	// OBS - UMA BOA PRATICA � DEIXAR OS ATRIBUTOS PRIVADOS E FAZER COM QUE 
	// A APLICAC�O SEJA RODADA APENAS PELOS SEUS METODOS
	
	
	public void deposita(double valor) {	
		this.saldo += valor;				
	}
	
	public boolean saca(double valor) {		
		if (this.saldo >= valor) {				
			this.saldo -= valor;				
			return true;						
		}
		return false;					
	}
	
	public boolean transfere(double valor, Conta conta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;	// mesmo que >>> this.saca(valor);
			conta.saldo += valor; 	// mesmo que >>> conta.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {		// metodo getSaldo � um getter
		return this.saldo;			// ele fornece o valor de um atributo privado
	}
}


