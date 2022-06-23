
public class ContaCorrente extends Conta {
	
			// com extends a classe herda os atributos e metodos, mas nao herda os construtores
	public ContaCorrente(int agencia, int numero) {
					// mesmos parametros passados no construtor da classe Conta
		
//		super(); 	// construtor da contaCorrente chama o construtor padrao da classe mae,
//					// caso ele exista. Caso haja somente um construtor especifico na classe
//					// mae este devera ser passado com os seus parametros. Do contrario o 
//					// o codigo nao ira compilar
		
		super(agencia, numero);		// parametros repassados do construtor especifico da classe  
									// filha para o construtor especifico da classe mae 
									// com o metodo super 		
	}
	
	@Override								// o @Override informa que um metodo da classe mae é
	public boolean saca(double valor) {		// reescrito na classe filha. Ele deve ter a mesma 
											// assinatura do metodo da classe mae (mesmo retorno,
											// mesmo nome e mesmos tipos de parametros
		
		double valorASacar = valor + 1;		// taxa de 1 real para realiza o saque
		
		return super.saca(valorASacar); 	// super chama o metodo sacar da classe mae
											// e recebe o valor do saque ja tratado com a taxa
	}
}
	