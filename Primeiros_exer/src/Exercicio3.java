import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.printf("A área do retângulo é: %.2f \n", area);
        System.out.printf("Para chegar o seguinte resultado foi realizado a seguinte formula: %.2f * %.2f = %.2f\n",base, altura, area);

        sc.close();
    }
}

/*
 * Explicação:
 * Vareaveis: base (double) / altura (double) / area (double)
 * Formula: (base * altura = area) Foi realizado formulas com valor double para calcular areas com valores inteiros e quebrados
 * E foi utilizado o Printf para melhor organizção, utilizando placeholder nos finais de cada print para poder exibir as vareveais captadas e usando "\n" para as quebras de linhas.
 */