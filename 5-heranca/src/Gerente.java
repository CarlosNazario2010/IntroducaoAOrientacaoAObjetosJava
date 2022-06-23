
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
//		return super.getBonificacao() + super.salario;   
			// super informa que a referencia nao é da classe, e sim da super classe
			// o super.salario funciona somente se o atributo salario da classe mae for protected
			// quando mudado para private deixa de funcionar
		
		return super.getBonificacao() + super.getSalario();
			// utilizando os getters que sao publicos, o metodo da classe filha funciona
	}
}
// Obs -DEVE SE TER CUIDADO AO USAR HERANCA, VISTO QUE ELA GERA UM GRANDE ACOPLAMENTO
// 		NO CODIGO, ENTRE AS SUPERCLASSES E AS CLASSES FILHAS
