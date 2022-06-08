package escola;

class Disciplina {

	public Disciplina(String nome, int semestre, int ano) {
		super();
		this.setNome(nome);
		this.setSemestre(semestre);
		this.setAno(ano);
	}
	String nome;
	int semestre;
	int ano;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
