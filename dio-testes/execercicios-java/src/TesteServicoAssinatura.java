import java.util.Scanner;

public class TesteServicoAssinatura {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do serviço: ");
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim(); 
        
        

        System.out.println("informe o seu nome e os serviços contratados");
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados
        
        scanner.close();
    }

}
