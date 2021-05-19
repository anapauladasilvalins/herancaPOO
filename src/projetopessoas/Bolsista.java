package projetopessoas;
public class Bolsista extends Aluno {
	
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.nome);
		System.out.println("=======================================================================================");
		
	}
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	@ Override
	public void pagarMensalidade() {
		System.out.println(this.nome + " é bolsista! pagamento facilitado."); 
	}

}
