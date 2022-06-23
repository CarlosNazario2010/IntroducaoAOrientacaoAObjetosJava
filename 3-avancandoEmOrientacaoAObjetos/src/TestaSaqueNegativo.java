
public class TestaSaqueNegativo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		
				// metodo sacar possui a regra de devolver false se saque maior que saldo
		System.out.println(conta.saca(250));
		// System.out.println(conta.saldo);
		
				// mas se poderia atribuir o valor diretamente no atributo saldo
				// visto que o atributo saldo é publico
		// conta.saldo -= 250;
		// System.out.println(conta.saldo);
		
			// tornando o atributo saldo como private, dentro da classe conta
			// nao é mais possivel acessa-lo fora da classe Conta
			// o atributo esta encapsulado
		
			// o saldo agora é informado pelo metodo getSaldo()
		System.out.println(conta.getSaldo());
	}
}
