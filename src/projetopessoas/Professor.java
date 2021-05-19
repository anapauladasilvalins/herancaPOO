package projetopessoas;
public class Professor extends Pessoa {
	
	private String especialidade;
	private float salario;
	
	public void receberAumento (float aumento) {
		this.salario += aumento;
		System.out.println("O Professor de " + this.especialidade +  ", teve aumento no seu salário passando a receber: " + this.salario);
		System.out.println("=======================================================================================");
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
		System.out.println("ESPECIALIDADE: " + this.getEspecialidade());
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
