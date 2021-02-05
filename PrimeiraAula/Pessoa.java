package PrimeiraAula;

public class Pessoa {
		
		public String nome;
		private int idade; 
		private double altura;
		private double peso;
		private String genero;
		private String tipoSanguineo;
		private String raca;
		private String corOlhos;
		private String endereco;
		private String escolaridade;
		
		public Pessoa(String nome, int idade, double altura, double peso, String genero, String tipoSanguineo,
				String raca, String corOlhos, String endereco, String escolaridade) {
			this.nome = nome;
			this.idade = idade;
			this.altura = altura;
			this.peso = peso;
			this.genero = genero;
			this.tipoSanguineo = tipoSanguineo;
			this.raca = raca;
			this.corOlhos = corOlhos;
			this.endereco = endereco;
			this.escolaridade = escolaridade;
		}

		public void andar() {
			System.out.println("Andando");
		}
		
		public void piscar() {
			System.out.println("Piscou");
		}
		
		public void comer() {
			System.out.println("Comendo");
		}

		public void respirar() {
			System.out.println("Respirando");
		}
		
		public void Falar() {
			System.out.println("Falando");
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

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getTipoSanguineo() {
			return tipoSanguineo;
		}

		public void setTipoSanguineo(String tipoSanguineo) {
			this.tipoSanguineo = tipoSanguineo;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public String getCorOlhos() {
			return corOlhos;
		}

		public void setCorOlhos(String corOlhos) {
			this.corOlhos = corOlhos;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getEscolaridade() {
			return escolaridade;
		}

		public void setEscolaridade(String escolaridade) {
			this.escolaridade = escolaridade;
		}
		
		
		
}
