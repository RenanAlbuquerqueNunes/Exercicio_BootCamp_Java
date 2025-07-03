import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.printf("A área do quadrado é: %.2f \n", area);
        System.out.printf("Para chegar o seguinte resultado foi realizado a seguinte formula: %.2f * %.2f = %.2f \n", lado, lado, area);
        sc.close();
    }
}

/*
 * Explicação:
 * Vareaveis: lado (double) / area (double)
 * Formula: (lado * lado = area) Foi realizado formulas com valor double para calcular areas com valores inteiros e quebrados
 * E foi utilizado o Printf para melhor organizção, utilizando placeholder nos finais de cada print para poder exibir as vareveais captadas e usando "\n" para as quebras de linhas.
 */