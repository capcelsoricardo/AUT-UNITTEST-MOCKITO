package mtp.com.br;

public class Avaliacao {
	
	public String avaliar(IAluno aluno) {
		double nota_final = aluno.getNotaP1() + aluno.getNotaP2() + aluno.getNotaTrabalho();
		
		if (nota_final >= 6 ) {
			return "Aprovado";
		}			
		else {
			if(nota_final < 6 && nota_final >= 4 )
				return "Exame";
			else
				return "Reprovado";			
		}							
	}
}
