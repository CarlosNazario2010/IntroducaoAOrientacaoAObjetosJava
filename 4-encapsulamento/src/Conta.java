
public class Conta {
	
	private static int totalDeContas; 	// atributo estatico, que pertence a classe e nao a instancia
										// atributo compartilhado entre todos os objetos instanciados
										// uma especie de variavel global dos objetos da classe
	private double saldo;			
	private int agencia;		
	private int numero;
	private Cliente titular;	
	
	
	// OBS - UMA BOA PRATICA É DEIXAR OS ATRIBUTOS PRIVADOS E FAZER COM QUE 
	// ELES SEJA MANIPULADOS PELOS GETTERS E SETTERS
	
	public Conta() {
		// construtor sem paremetros padrao do java. Opcional se não houver nenhum construtor
		// obs - o java permite mais de um construtor por classe
	}
	
	public Conta(int agencia, int numero) {		// construtor da classe, que recebe os paramentros
												// agencia e conta, necessarios para criar um objeto
												// conta
		/* Conta.totalDeContas++; >> pode ser escrito assim. O this. é para instancia e o 
								   	 nome da classe (Conta.) para a classe 	*/
		totalDeContas++;
		System.out.println("Total de contas criadas: " + totalDeContas);
		
		if (agencia <= 0 || numero <= 0) {
			System.out.println("Agencia precisa ser um numero inteiro positivo");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
	}
	
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
	
	public static int getTotalDeContas() {	// getter static. Retorna o valor de um
		return totalDeContas;				// atributo estatico
	}
	public double getSaldo() {				// metodo getSaldo é um getter
		return this.saldo;					// ele fornece o valor de um atributo privado
	}
	public int getNumero() {				// getter para o numero da conta
		return this.numero;
	}
	public int getAgencia() {				// getter para o numero da agencia
		return this.agencia;
	}
	public void setNumero(int numero) { 	// metodo setNumero é um setter		
		this.numero = numero;				// ele permite alterar o valor de um atributo privado
											// dessa forma, alem de proteger os atributos
											// qualquer nova regra de negocio, pode ser implementada
											// no metodo setter da classe
	}
	public void setAgencia(int agencia) {	// setter para o numero da agencia
		this.agencia = agencia;				// obs - Em geral, os setters retornam um void
	}
	public Cliente getTitular() {			// getter para o titular da conta
		return titular;						// obs - titular é uma instancia da classe Cliente - 
	}
	public void setTitular(Cliente titular) { 	
		this.titular = titular;
	}
}


