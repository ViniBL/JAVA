package escola;
import java.util.ArrayList;

import escola.Disciplina;

abstract class Pessoa {
	
	public Pessoa(String nome, int idade, boolean casado, char sexo) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setCasado(casado);
		this.setSexo(sexo);
		
	}
	private String nome;
	private int idade;
	private boolean casado;
	private char sexo;
	private ArrayList<Disciplina> disciplinas = new ArrayList<>(); 
	
	
	public void verificaIdade()
	{
		if (this.idade >= 18) 
		{
			System.out.println(this.nome + " É‰ maior de idade!");
		}
		else
		{
			System.out.println(this.nome + " É menor de idade!");
		}
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
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	/**
	 * @return the disciplina
	 */
	public void getDisciplinas() {
		for(int i = 0;i < disciplinas.size();i++)
		{
			System.out.println(disciplinas.get(i).nome);
		}
	}
	/**
	 * @param disciplina the disciplina to set
	 */
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}

	

	

	
	
}
