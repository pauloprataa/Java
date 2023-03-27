package servicos;

import java.util.Scanner;

public class SistemaLavagem {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int escolhaCliente;
		int tipoLavagem;
		double valorLavagem;
		
		System.out.println("Qual serviço deseja fazer? 1-Lavagem");
		escolhaCliente = entrada.nextInt();
		
		if(escolhaCliente == 1)  {
			System.out.println("O preço da Lavagem é: 1-Veículo pequeno - R$ 20.00");
			System.out.println("O preço da Lavagem é: 2-Veículo grande - R$ 40.00");
			System.out.println("O preço da Lavagem é: 3-Veículo médio - R$ 30.00");
			System.out.println("O preço da Lavagem por fora é: R$ 35.00");
			System.out.println("O preço da Lavagem Completa é: R$ 50.00 \n");

			System.out.println("Qual tipo de lavagem gostaria no veículo?");
			tipoLavagem = entrada.nextInt();
						
			if(tipoLavagem == 1) {
				System.out.println("Você escolheu veículo pequeno");				
			}	
			if(tipoLavagem == 2) {
				System.out.println("Você escolheu veículo grande");
			}
			if(tipoLavagem == 3) {
				System.out.println("Você escolheu veículo médio");
			}
			valorLavagem = entrada.nextDouble();
								
		}
		
		entrada.close();
	}
}
