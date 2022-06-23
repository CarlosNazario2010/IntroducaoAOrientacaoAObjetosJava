
public class Funcionario {

	private String nome;			
	private String cpf;	
	private double salario;
	
//	protected double salario; 	// protected informa que o atributo esta disponivel para a classe e suas fihas		
		
	
	public double getBonificacao() { 	// é possivel criar um getter, mesmo 
		return this.salario * 0.1;		// se nao houver o atributo
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
