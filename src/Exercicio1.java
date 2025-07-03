import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = sc.nextInt();

        int anoAtual = 2025;
        int idade = anoAtual - anoNascimento;

        System.out.printf("Olá %s, você tem %d anos. \n", nome,idade);
        System.out.printf("Para chegar o seguinte resultado foi realizado a seguinte formula: %d - %d = %d\n",anoAtual,anoNascimento,idade);

        sc.close();
    }
}

/*
 * Explicação:
 * Vareaveis: nome (String) / anoNascimento (int) / anoAtual (int) / idade (int)
 * Formula: (anoNascimento - anoAtual = idade) A vareavel anoAtual já havia sido definida como 2025
 * E foi utilizado o Printf para melhor organizção, utilizando placeholder nos finais de cada print para poder exibir as vareveais captadas e usando "\n" para as quebras de linhas.
 */