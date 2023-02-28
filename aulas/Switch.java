package aulas;

public class Switch {
	public static void main(String[] args) {
		
		int nota = 7;
		
		switch (nota) {
		case 4:
			System.out.println("Você está reprovado");
			break;
		case 5:
			System.out.println("Você está aprovado");
			break;
		case 6:
			System.out.println("Você está aprovado");
			break;
		case 7:
			System.out.println("Você está aprovado sempre");
			break;
		defaut:
				System.out.println("Inválido");
			break;
		
		}
	}
	
}
