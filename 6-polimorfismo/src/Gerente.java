
	// Funcionario � a classe mae e Gerente � a classe filha
	// Gerente � um Funcionario. Classe Gerente herda atributos e metodos da Classe Funcionario
public class Gerente extends Funcionario {

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getBonificacao() { 
		return super.getBonificacao() + super.getSalario();
	}
}
