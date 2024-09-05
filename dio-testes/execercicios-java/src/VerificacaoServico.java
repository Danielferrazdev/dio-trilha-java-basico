import java.util.Scanner;

public class VerificacaoServico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        System.out.println("Digite o serviço a ser verificado:");
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o nome do cliente e os serviços contratados, separados por vírgula:");
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",", 2);  // Dividindo em no máximo 2 partes

        // Verifica se a entrada tem pelo menos o nome do cliente e o(s) serviço(s)
        if (partes.length >= 2) {
            String nomeCliente = partes[0].trim();
            String servicoContratado = partes[1].trim();

            // Verifica se o serviço está na lista de serviços contratados
            if (servicoContratado.contains(servico)) {
                System.out.println(" SIM O cliente " + nomeCliente + " contratou o serviço: " + servico);
            } else {
                System.out.println("NAO O cliente " + nomeCliente + " não contratou o serviço: " + servico);
            }
        } else {
            System.out.println("Formato de entrada inválido. Certifique-se de que o nome e os serviços estão separados por uma vírgula.");
        }

        scanner.close();
    }
}