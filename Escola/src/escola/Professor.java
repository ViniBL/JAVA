package escola;

public class Professor extends Pessoa {

	public Professor(String nome, int idade, boolean casado, char sexo, String titulacao, int horas_semanais, String departamento) {
		super(nome, idade, casado, sexo);
		this.setTitulacao(titulacao);
		this.setHoras_semanais(horas_semanais);
		this.setDepartamento(departamento);
	}
	
	private String titulacao;
	private int horas_semanais;
	private String departamento;
	
	
	//Sobrescita
	public void verificaIdade()
	{
		if(this.getIdade() > 60)
		{
			System.out.println(this.getNome() + " É um idoso!");
		}
		else 
		{
			System.out.println(this.getNome() +" Não é um idoso!");
		}
	}
	
	public void verificaIdade(int idade)
	{
		if(this.getIdade() > idade)
		{
			System.out.println("O professor " + this.getNome() + " não é mais velho!");
		}
		else
		{
			System.out.println("O professor " + this.getNome() + " não é mais velho!");
		}
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public int getHoras_semanais() {
		return horas_semanais;
	}
	public void setHoras_semanais(int horas_semanais) {
		this.horas_semanais = horas_semanais;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	

}
