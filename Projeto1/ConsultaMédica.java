package Projeto1;

public class ConsultaMédica {

	private String nome;
	private int idade;
	private float rg;
	private boolean Planosaude;
	private boolean Particular;
	private float celular;
	
	public ConsultaMédica(String nome, int idade, float rg, boolean planosaude,boolean particular, float celular) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
		Planosaude = planosaude;
		Particular = particular;
		this.celular = celular;
		
		
	}

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

	public float getRg() {
		return rg;
	}

	public void setRg(float rg) {
		this.rg = rg;
	}

	public boolean isPlanosaude() {
		return Planosaude;
	}

	public void setPlanosaude(boolean planosaude) {
		Planosaude = planosaude;
	}

	public boolean isParticular() {
		return Particular;
	}

	public void setParticular(boolean particular) {
		Particular = particular;
	}
	
	public float getCelular() {
		return celular;
	}

	public void setCelular(float celular) {
		this.celular = celular;
	}
	
	public void imprimir() {
		System.out.println(nome+"\n"+"idade: "+idade+" anos"+"\n"+"RG: "+rg+"\n"+"Telefone para contato: "+celular+"está cadastrada com plano de saúde: "+Planosaude+"Está cadastrada como particular: "+Particular);
	}
}