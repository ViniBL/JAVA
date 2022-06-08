package escola;

import escola.*;

public class Main {

	public static void main(String[] args) {
		
		Aluno vini = new Aluno("Vini",20,false,'M',169243,5);
		Aluno kaline = new Aluno("Kaline",21,true,'F',184324,7);
		
		Disciplina TC = new Disciplina("TC",1,2022);
		Disciplina POOA = new Disciplina("POOA",1,2022);
		Disciplina DW1 = new Disciplina("DW1", 1, 2022);
		Disciplina ES1 = new Disciplina("ES1", 1, 2022);

		
		vini.addDisciplina(DW1);
		vini.addDisciplina(POOA);
		vini.addDisciplina(TC);
		
		kaline.addDisciplina(POOA);
		kaline.addDisciplina(TC);
		
		System.out.println("Disciplinas do Vini");
		vini.getDisciplinas();
		
		System.out.println("Disciplinas da Kaline");
		kaline.getDisciplinas();
		
		Professor Ferrari = new Professor("Ferrari", 54, true, 'M',"Doutor",20,"DC");
		
		Ferrari.addDisciplina(ES1);
		Ferrari.verificaIdade();
		Ferrari.verificaIdade(30);
		
		vini.verificaIdade();
		
		
	}

}
