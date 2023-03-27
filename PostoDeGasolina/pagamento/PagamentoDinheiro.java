package pagamento;

public class PagamentoDinheiro {
	
	public static void pagamentoEmDinheiro(double quantiaEmDinheiro, double valorAbastecido) {
		if(quantiaEmDinheiro == valorAbastecido) {
			System.out.println("Obrigado, volte sempre!");
		}else if (quantiaEmDinheiro > valorAbastecido) {
			double troco = quantiaEmDinheiro - valorAbastecido;
			
			System.out.println("O seu troco é de %.2f, agradecemos!");
		}else if (quantiaEmDinheiro < valorAbastecido) {
			System.out.println("Fiado só amanhã");
		}
		
		
		
		
	}

}
