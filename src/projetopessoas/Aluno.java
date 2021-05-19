package projetopessoas;
public class Aluno extends Pessoa {
	
	private int matricula;
	private String curso;
	
	public void pagarMensalidade() { 
			System.out.println("Pagando mensalidade de " + this.nome + "...");
			System.out.println("=======================================================================================");
			// this.nome porque na Classe Pessoa os atributos estão protegidos 
			// seria this.getNome se os atributos da Classe Pessoa estivesse privado.
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
		System.out.println("MATRICULA: " + this.matricula);
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
		System.out.println("CURSO: " + this.curso);
	}
	
}
