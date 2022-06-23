
	// Funcionario é a classe mae e Gerente é a classe filha
	// Gerente é um Funcionario. Classe Gerente herda atributos e metodos da Classe Funcionario
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
