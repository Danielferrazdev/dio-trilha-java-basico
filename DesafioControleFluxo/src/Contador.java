import java.util.Scanner;

public class Contador {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Cria um objeto Scanner para ler a entrada do usuário
            // Solicita os dois números inteiros
            System.out.print("Digite o primeiro número inteiro: ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int segundoNumero = scanner.nextInt();

            // Calcula a diferença entre os dois números
            if (segundoNumero <= primeiroNumero) {
                throw new IllegalArgumentException();
            }

            int resultado = segundoNumero - primeiroNumero;

            // Imprime a sequência do número 1 até o resultado da subtração
            System.out.print("A sequência é: ");
            for (int i = 1; i <= resultado; i++) {
                System.out.print(i);

                if (i < resultado)
                    System.out.print(", ");
                else
                    System.out.println();

            }
        } catch (IllegalArgumentException e) {
            System.out.println("O segundo paranmetro deve ser MAIOR que o primeiro");
        }

        // Fecha o scanner
        scanner.close();
    }
}
