package Posto.servicos;

import java.util.Scanner;

	public class LavagemAtiv {

	static double valorLavagem;

  	public static void lavagemVeiculos() {

        Scanner entrada = new Scanner(System.in);

        double valorLavagemCarroMedio = 30.00;
        double valorLavagemCarroPequeno = 25.00;
        double valorLavagemCarroGrande = 60.00;

        System.out.printf("Valor do veiculos: R$ %n", valorLavagemCarroMedio);

        int tipoVeiculo;
        
        do{
            System.out.println("Insira o tipo de veículo (1 - carro, 2 - moto, 3 - caminhão): ");
            tipoVeiculo = entrada.nextInt();

            switch (tipoVeiculo){

                case 1:
                System.out.printf("Valor da lavagem para carro: R$%.2f\n", valorLavagemCarroMedio);
                valorLavagem = valorLavagemCarroMedio;
                break;

                case 2:
                System.out.printf("Valor da lavagem para carro: R$%.2f\n", valorLavagemCarroPequeno);
                valorLavagem = valorLavagemCarroPequeno;
                break;

                case 3:
                System.out.printf("Valor da lavagem para carro: R$%.2f\n", valorLavagemCarroGrande);
                valorLavagem = valorLavagemCarroGrande;
                break;

                default:
                System.out.println("Tipo de veículo inválido.");
                break;
            }
            
        } while (tipoVeiculo != 1 && tipoVeiculo != 2 && tipoVeiculo != 3);

        System.out.println("Qual a forma de pagamento?");

        entrada.close();
    }
  
}
