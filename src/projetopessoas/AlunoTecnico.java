package projetopessoas;
public class AlunoTecnico extends Aluno{
	
	private int registroProfissional;
	
	public void praticar() {
		System.out.println(this.nome + " é aluno técnico do curso de " + this.getCurso() + " e estuda de segunda a sexta feira.");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
}
