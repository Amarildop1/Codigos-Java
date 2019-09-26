import java.util.Scanner;

public class Imprensadinho{
	/**
	 * @Author Amarildo
	 * Imprensadinho - Adivinhe o número!
	 * Gera um número entre 1 e 100.
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int tentativa=0;
		double numeroAleatorio=0;
		
		numeroAleatorio = (int) (Math.random() * 100);
		do{
			System.out.print("Advinhe o número entre 1 e 100: ");
			tentativa = entrada.nextInt();

			if(tentativa == numeroAleatorio){
				System.out.println("Parabéns. Você advinhou o número! \n");
			}else if(tentativa > numeroAleatorio){
				System.out.println("Muito alto. Tente novamente! \n");
			}else if(tentativa < numeroAleatorio){
				System.out.println("Muito baixo. Tente novamente! \n");
			}
		}while(tentativa != numeroAleatorio);
		
	} //Fim do main	
} //Fim da class
