
public class Conta {
	
	private static int totalDeContas; 
										
	private double saldo;			
	private int agencia;		
	private int numero;
	private Cliente titular;
	
//	public Conta() {
//		// construtor padrao da classe. Opcional caso seja o unico construtor, o que nao é caso
//		// usado para estudar a criacao do construtor na classe filha
//	}
	
	public Conta(int agencia, int numero) {		
							
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
		if(valor <= 0) {
			System.out.println("Valor de deposito invalido");
			return;
		}
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
	
	// getter static
	public static int getTotalDeContas() {
		return totalDeContas;				
	}
	
	// getter e setters padrao
	public double getSaldo() {		
		return this.saldo;			
	}
	public int getNumero() {		
		return this.numero;
	}
	public void setNumero(int numero) { 	
		this.numero = numero;															
	}
	public int getAgencia() {		
		return this.agencia;
	}
	public void setAgencia(int agencia) {	
		this.agencia = agencia;				
	}
	public Cliente getTitular() {			
		return titular;						 
	}
	public void setTitular(Cliente titular) { 	
		this.titular = titular;
	}
}


