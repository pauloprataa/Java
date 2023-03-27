package pessoas;

public class Lavagem {

	public static void Ducha (int tipoLavagem, String tipoVeiculo) {
		System.out.println(tipoLavagem + "Foi lavado o veículo pequeno");
		double veiculoPequeno = 20.00;
		double veiculoGrande = 40.00;
		double veiculoMedio = 30.00;
		double lavagemCompleta = 50.00;
		double lavarPorFora = 35.00;
		
		if (tipoLavagem == 1) {
			tipoLavagem = tipoVeiculo;
			System.out.println("Foi lavado o veículo pequeno");			
		}if (tipoLavagem == 2);{
			tipoLavagem = tipoVeiculo;
		System.out.println("Foi lavado o veículo Grande");
		}if (tipoLavagem == 3);{
			tipoLavagem = tipoVeiculo;
		System.out.println("Foi lavado o veículo Medio");
		}if (tipoLavagem == 4);{
			tipoLavagem = tipoVeiculo;
		System.out.println("Foi realizado a lavagem completa");
		}else {
			tipoLavagem = tipoVeiculo;
			System.out.println("Foi realizado a lavagem por fora");
		}
	}

	

}
