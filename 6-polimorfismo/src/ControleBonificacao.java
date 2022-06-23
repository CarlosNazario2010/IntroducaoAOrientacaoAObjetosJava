
public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.soma += bonificacao;
	}
		// com o polimorfismo nao precisamos criar um metodo especifico de registro
		// de bonificacoes para cada funcionario especifico
		// como gerente e supervisor tambem sao do tipo funcionario, apenas a instancia
		// do Funcionario pode ser passado como referencia para o metodo registra da classe
	
//	public void registra(Gerente gerente) {
//		double bonificacao = gerente.getBonificacao();
//		this.soma += bonificacao;
//	}
//	
//	public void registra(Supervisor supervisor) {
//		
//		double bonificacao = supervisor.getBonificacao();
//		this.soma += bonificacao;
//	}
	
	public double getSoma() {
		return soma;
	}
}
