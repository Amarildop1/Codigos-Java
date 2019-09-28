import java.util.Scanner;
/**
* Programa em Java que recebe o valor do salário bruto
* Calcula o valor de desconto do INSS
* Exibe o Salário Líquido
*/
/**
*@author Amarildo
*/

public class CalculaSalarioComDescontoDeINSS{

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double salBruto, salLiquido, descINSS;

		System.out.print("\n-------- Calcula desconto do INSS --------\n");
		System.out.print("Informe seu salário total: R$ ");
		salBruto = entrada.nextDouble();

		if (salBruto <= 1751.81) {
			descINSS = 0.08;
			salLiquido = salBruto - (salBruto * descINSS);
		}else if (salBruto > 1751.81 && salBruto <= 2919.72) {
			descINSS = 0.09;
			salLiquido = salBruto - (salBruto * descINSS);
		}else{
			descINSS = 0.11;
			salLiquido = salBruto - (salBruto*descINSS);
		}
		System.out.println("\nSalário Bruto: " + salBruto + 
							"\nDesconto de " + (int)(descINSS*100) + "%: " + (salBruto*descINSS) +
							"\nSalário Líquido: " + salLiquido);
	}

}