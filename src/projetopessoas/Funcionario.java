package projetopessoas;
public class Funcionario extends Pessoa {
	
	private String setor;
	private boolean trabalhando;
	
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
		System.out.println("SETOR: " + this.setor);
		System.out.println("=======================================================================================");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> VISITANTE <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}

	public boolean isTrabalhando() { // pode ser get ou is
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
}
