package projetopessoas;
public class ProjetoPessoas {

	public static void main(String[] args) {
		
		// PROGRAMA PRINCIPAL
		
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		AlunoTecnico aT1 = new AlunoTecnico();
		Professor p1 = new Professor();
		Funcionario f1 = new Funcionario();
		Visitante v1 = new Visitante();
		
		a1.setNome("Maria");
		a1.setIdade(18);
		a1.setSexo("Feminino");
		
		b1.setNome("Jubileu");
		b1.setIdade(19);
		b1.setSexo("Masculino");
		
		aT1.setNome("Jurema");
		aT1.setIdade(20);
		aT1.setSexo("Feminino");
		
		p1.setNome("Claudio");
		p1.setIdade(45);
		p1.setSexo("Masculino");
		
		f1.setNome("Fabiana");
		f1.setIdade(42);
		f1.setSexo("Feminino");
		
		v1.setNome("Pedro");
		v1.setIdade(16);
		v1.setSexo("Masculino");
		
		//toString()
		
		System.out.println(a1.toString());
		a1.setMatricula(1273);
		a1.setCurso("Informática");
		a1.pagarMensalidade();     // Está Sobreposto/@Override mesmo método usado em outra classe
		
		System.out.println(b1.toString());
		a1.setMatricula(1482);
		b1.setCurso("Inglês");
		b1.pagarMensalidade(); // @Override // mesmo método usado de forma diferente.
		b1.renovarBolsa();
		
		System.out.println(aT1.toString());
		a1.setMatricula(1230);
		aT1.setCurso("Programação");
		aT1.praticar();
		aT1.pagarMensalidade();
		
		System.out.println(p1.toString());
		p1.setEspecialidade("matemática");
		p1.setSalario(2500.75f);
		p1.receberAumento(550.20f);
		
		System.out.println(f1.toString());
		f1.mudarTrabalho();
		f1.setSetor("Estoque");
		
		System.out.println(v1.toString());
	}

}
