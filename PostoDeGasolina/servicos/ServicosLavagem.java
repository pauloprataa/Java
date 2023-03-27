package servicos;

import java.util.Scanner;

public class ServicosLavagem {
	
	public static double formaPagamento(int formaEscolhida, double valorLavagem) {
		
		Scanner entrada = new Scanner(System.in);
		
		switch (formaEscolhida) {
		case 1: 
		System.out.println("Pago em dinheiro");
		
		System.out.println("Qual o valor pago?");
		double valorPago = entrada.nextDouble();
		
		break;
		
		default:
			
		}
		
		

	}
	
	

}
