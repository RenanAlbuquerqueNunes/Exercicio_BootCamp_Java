import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        sc.nextLine(); // Limpar o buffer

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        int diferenca = Math.abs(idade1 - idade2);

        System.out.printf("A diferença de idade entre %s e %s é de %d anos.\n", nome1, nome2, diferenca);
        System.out.printf("Para chegar o seguinte resultado foi realizado a seguinte formula: %d - %d = %d\n", idade1,idade2,diferenca);
        sc.close();
    }
}
 /*
 * Explicação:
 * Vareaveis: nome1 (String) / nome2 (String) / idade1 (int) / idade2 (int) / diferenca (int).
 * Formula: (idade1 - idade 2 = diferenca) e foi utilizado o metodo "Math.abs()" que retorna o valor absoluto (Remove o sinal negativo (se houver) e Retorna o numero sempre como positivo).
 * E foi utilizado o Printf para melhor organizção, utilizando placeholder nos finais de cada print para poder exibir as vareveais captadas e usando "\n" para as quebras de linhas.
 */