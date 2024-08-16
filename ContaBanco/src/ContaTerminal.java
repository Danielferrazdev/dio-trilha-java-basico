import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Conhecer e importa a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        //Exibir as mensagens para o nosso usuÃ¡rio
        System.out.println("Por favor informe o seu numero:");
        int numero = scanner.nextInt();
       
        System.out.println("Por favor informe a agencia do cliente:");
        String agencia = scanner.next();
       
        System.out.println("Por favor informe o Nome do cliente: ");
        String nome = scanner.next();
        
        System.out.println("Por favor informe o sobrenome do cliente: ");
        String sobrenome = scanner.next();

        System.out.println("Por favor informe o saldo do cliente: ");
        double saldo = scanner.nextDouble();
       
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        System.out.println("Ola, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta "+ numero + " e seu sado de U$ " + saldo + " Já está disponível pra saque.");
    }
}
