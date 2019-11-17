import java.util.Scanner;

public class NivelDeAnjoESafado{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int dia=0, mes=0, ano=0, safadeza = 0, anjo = 0;

        System.out.println("\nInforme o dia do seu nascimento: ");
        dia = entrada.nextInt();
        System.out.println("Informe o mês (Ex.: 1 até 12): ");
        mes = entrada.nextInt();
        System.out.println("Informe o ano: ");
        ano = entrada.nextInt();

        safadeza = ((mes) + (ano/100) * (50 - dia))/10;
        anjo = (100 - safadeza);

        System.out.println("\n----- Resultado -----\n");
        System.out.println(safadeza + "% Safado.");
        System.out.println(anjo + "% Anjo.\n");
    }
}
/*
	Programa do wesley_safadao recebe uma data de nascimento (dia, mes e ano)
	e calcula a porcentagem de anjo e a porcentagem de safado de uma pessoa que nasceu na data de entrada.
	Fórmula: safadeza = mes + (ano/100) * (50-dia).
	Anjo = 100 - safadeza.
	A função não retorna nada, apenas escreve a % na tela.
*/