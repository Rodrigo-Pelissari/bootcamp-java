import java.util.Scanner;

public class ContaTerminal
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite o número da Agência: ");
	    String agencia = scanner.next();
	    
	    System.out.println("Digite o número da conta: ");
	    int numeroConta = scanner.nextInt();
	    
	    System.out.println("Digite seu primeiro nome: ");
	    String nomeCliente = scanner.next();
	    
	    System.out.println("Digite seu sobrenome: ");
	    String sobrenomeCliente = scanner.next();
	    
	    System.out.println("Qual o valor do saldo atual?");
	    double saldo = scanner.nextDouble();
	    
	    System.out.println("\nOlá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por abrir uma conta em nosso banco!\nNúmero da agência: " + agencia + "\nNúmero da conta: " + numeroConta + "\nSaldo disponível: " + saldo + ".\n");
	    
	    
	}
}
