package aulas;

public class IfElse {
	
	public static void main(String[] args) {
		
		double idade = 15;
		
		// condição ou verificação
		if (idade >= 18) {
			System.out.println("A pessoa é maior de 18 anos");
		}else {
			System.out.println("A pessoa é menor de idade");
		}
		
		double media = 5.5;
				
		if (media >=5.5) {
			System.out.println("Aprovado");
		}else if (media >= 4 && media < 5.5){       // Com else if precisa de uma nova verificação
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
	}

}
