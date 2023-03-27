import java.util.Scanner;

import pagamento.Credito;
import pagamento.Pagamento;
import pessoas.Cliente;
import pessoas.Funcionario;
import pessoas.Lavagem;
import servicos.Abastecimento;

public class SistemaPosto {
	
	public static void main(String[] args) {
		
		int escolhaCliente;
		int tipoCombustivel;
		double valorAbastecer;
		double qtdeCombustivel;
		
		Scanner entrada = new Scanner(System.in);
		
//		Cliente c1 = new Cliente();
//		c1.nome = "Paulo";
//		c1.sobreNome = "Prata";
		
//		Cliente c2 = new Cliente("Gilcemar", "Borges");
//		Cliente c3 = new Cliente("Paulo", "Prata");
//		Cliente c4 = new Cliente("João", "Pedro");
//		
//		System.out.println(c2.nome);
//		System.out.println(c4.sobreNome);
//		System.out.println(c3.sobreNome);
//		c2.dizNomeCliente("Gilcemar");
//
//		
//		System.out.println(Funcionario.enderecoPosto);
//		
//		Credito.pagoNoCredito("Paulo");
		
//		O SISTEMA COMEÇA AQUI
		
		System.out.println("Olá, seja bem vindo(a) ao posto Transforme-se");
		
		System.out.println("Qual serviço deseja fazer? 1-Abastecer, 2-Lavagem ");
		escolhaCliente = entrada.nextInt();
		
		if(escolhaCliente == 1) {
//			System.out.println("O preço dos combustiveis: \n");
			System.out.println("O preço dos combustíveis: 1-Gasolina - R$ 4.75 2-Etanol - R$ 3.85 3-Diesel - R$ 5.15 ");
			System.out.println("Qual combustível gostaria de abastecer?");
			tipoCombustivel = entrada.nextInt();
			
			System.out.println("Quanto gostaria de abastecer:");
			valorAbastecer = entrada.nextDouble();
			
//			if (tipoCombustivel == 1) {
//				qtdeCombustivel = valorAbastecer / 4.75;
//				System.out.printf("Foi abatecido o valor de %.2f, rendendo a quantidade de %.3f litros", valorAbastecer,qtdeCombustivel);
//			}
			
			Abastecimento.Abastecer(tipoCombustivel, valorAbastecer);
			
			System.out.println("Qual seria a forma de pagamento? 1-Dinheiro 2-Débito 3-Crédito");
			int formaPagamento = entrada.nextInt();
			
			Pagamento.formaPagamento(formaPagamento, valorAbastecer);
	
			
			
			
			
			
			
//			%.2f 20.00 - Dinheiro
//			%.3f 1.325 litros - Combustível
			
			

		}
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
		
	}
	

}
