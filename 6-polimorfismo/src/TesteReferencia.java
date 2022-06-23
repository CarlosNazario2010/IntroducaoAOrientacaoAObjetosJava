
public class TesteReferencia {

	public static void main(String[] args) {
		
			// é permitido instanciar um objeto de uma classe filha atribuindo a referencia da classe mae
			// todo gerente é um funcionário. Mas nem todo funcionario é um gerente
			// o objeto criado sempre vai ser do tipo gerente
			// mas a referencia para o objeto pode ser do tipo funcionario (no caso, mais generico)
			// essa é a ideia basica do polimorfismo
		Funcionario gerente1 = new Gerente();
		
		gerente1.setSalario(5000.00);
		gerente1.setNome("Carlos");
		String nome1 = gerente1.getNome();
		
			// mas esta instancia perde os metodos da classe filha (como o autentica da classe gerente)
		//	gerente1.autentica(123456);
		
		System.out.println(nome1);
		
		Gerente gerente2 = new Gerente();
		Funcionario funcionario = new Funcionario();
		Supervisor supervisor = new Supervisor();
		
		gerente2.setSalario(5000.00);		// bonificacao de salario + 10 porcento
		funcionario.setSalario(3000.00);	// bonificacao de 10 porcento 
		supervisor.setSalario(4000.00);    	// bonificacao de 20 porcento (dobro do funcionario)
		
		ControleBonificacao controle = new ControleBonificacao();
		
			// metodo registra de ControleBonificacao pode receber como parametro
			// qualquer instancia que tambem seja do tipo funcionario 
			// (funcionario, gerente ou supervisor)
			// mesmo recebendo na classe ControleBonificacao um parametro generico,
			// do tipo Funcionario, o metodo registra irá realizar a operacao de acordo
			// com a instancia passada no parametro da chamada do metodo e essa
			// é uma das grandes vantagens de se utilizar o polimorfismo
		
		controle.registra(gerente2);
		controle.registra(funcionario);
		controle.registra(supervisor);
		
		System.out.println(gerente2.getBonificacao());
		System.out.println(funcionario.getBonificacao());
		System.out.println(supervisor.getBonificacao());
		System.out.println(controle.getSoma());
	}
}
