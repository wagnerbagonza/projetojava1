package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	public static void main(String[] args) {
		//Objeto ainda n�o existe na mem�ria
		//Aluno aluno1;
		//Objeto alocado na mem�ria
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);
	}

}
