package projetopessoas;
public abstract class Pessoa {
	
	//ATRIBUTOS
	protected String nome;
	protected int idade;
	protected String sexo;
	
	// MÉTODO INTERNO - FINAL
	public void fazerAniversario() {
		this.idade++;
	}
	
	//MÉTODOS ESPECIAIS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	//toString()
	
	@Override
	public String toString() {
		return "DADOS > nome: " + nome + ", idade: " + idade + ", sexo: " + sexo ;
	}

}
