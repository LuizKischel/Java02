package PrimeiraAula;

public class Animal {
	
	private double altura;
	private double peso;
	private String esp�cie;
	private String grupo;
	private String cadeiaAlimentar;
	private int idade;
	private String habitat;
	private String mam�fero;
	private boolean domestico;
	private boolean mata;	
	
	public Animal(double altura, double peso, String esp�cie, String grupo, String cadeiaAlimentar, int idade,
			String habitat, String mam�fero, boolean domestico, boolean mata) {
		super();
		this.altura = altura;
		this.peso = peso;
		this.esp�cie = esp�cie;
		this.grupo = grupo;
		this.cadeiaAlimentar = cadeiaAlimentar;
		this.idade = idade;
		this.habitat = habitat;
		this.mam�fero = mam�fero;
		this.domestico = domestico;
		this.mata = mata;
	}

	public void atacar() {
		System.out.println("Atacando");
	}
	
	public void deslocar() {
		System.out.println("Deslocando");
	}
	
	public void comer() {
		System.out.println("Comendo");
	}
	
	public void acasalar() {
		System.out.println("acasalando");
	}
	
	public void adaptar() {
		System.out.println("adaptando");
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getEsp�cie() {
		return esp�cie;
	}

	public void setEsp�cie(String esp�cie) {
		this.esp�cie = esp�cie;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getCadeiaAlimentar() {
		return cadeiaAlimentar;
	}

	public void setCadeiaAlimentar(String cadeiaAlimentar) {
		this.cadeiaAlimentar = cadeiaAlimentar;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getMam�fero() {
		return mam�fero;
	}

	public void setMam�fero(String mam�fero) {
		this.mam�fero = mam�fero;
	}

	public boolean isDomestico() {
		return domestico;
	}

	public void setDomestico(boolean domestico) {
		this.domestico = domestico;
	}

	public boolean isMata() {
		return mata;
	}

	public void setMata(boolean mata) {
		this.mata = mata;
	}
	
	

}
