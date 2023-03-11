package aulas;

import java.util.Scanner;

public class SistemaEscola {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Alunos paulo = new Alunos();
		paulo.nome = "Paulo";
		paulo.ano = 2023;
		paulo.sobreNome = "Prata";
		paulo.gostaJava = true;
		paulo.nota = 10.1;
		
		Alunos gabriel = new Alunos();
		gabriel.gostaJava = true;
		gabriel.sobreNome = "Nunes";
		gabriel.ano = 2020;
		gabriel.participacao = "presente";
		gabriel.nome = "Gabriel";
		
		Alunos suda = new Alunos();
		suda.ano = 2021;
		suda.gostaJava = false;
		suda.nome = "Marco Suda";
		suda.nota = 9.0;
		
		System.out.println("O aluno " + paulo.nome + " tirou a nota " + paulo.nota );
		System.out.println("O aluno " + suda.nome + " estuda Java junto com o aluno " + paulo.nome + " e o professor se chama " + gabriel.nome + " " + gabriel.sobreNome);
		System.out.printf("O professor " + gabriel.nome + " ensina Java para os alunos do Serasa sendo a nota deles " +  paulo.nome + " " +  paulo.nota + " e " + suda.nome + " " + suda.nota
				);
		
	}

}
