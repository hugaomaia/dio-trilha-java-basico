import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
		String agencia;
		String nomeCliente;
		double saldo;

        System.out.println("Por favor, digite o número da Agência: ");
		numero = sc.nextInt();
		System.out.println("Por favor, digite a agência: ");
		agencia = sc.next();
		System.out.println("Por favor, digite o nome do cliente: ");
		sc.nextLine();
		nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite o saldo desejado para saque: ");
		saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + 
				", obrigado por criar uma conta em nosso banco! Sua agência é "
				+ agencia + ", conta " + numero + " e seu saldo R$" 
				+ saldo + " já está disponível para saque.");
		
		sc.next();


    }
}
