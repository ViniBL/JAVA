package escola;

public class Aluno extends Pessoa {

	
	public Aluno(String nome, int idade, boolean casado, char sexo, int IRA, int Periodo) {
		super(nome, idade, casado, sexo);
		this.setIRA(IRA);
		this.setPeriodo(Periodo);
		
	}
	private int IRA;
	private int periodo;
	
	
	public int getIRA() {
		return IRA;
	}
	public void setIRA(int iRA) {
		IRA = iRA;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	

}
