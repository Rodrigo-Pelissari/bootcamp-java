import java.util.Scanner;

public class VerificadorContaBancaria
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número da sua conta bancária");
		String numeroConta = scanner.next();
		
		try{
		    if(numeroConta.length() == 8)
		    {
		        System.out.println("Número de conta válido!");
		    }else
		    {
		        throw new IllegalArgumentException("Número de conta inválida. Contas em nosso sistema devem ter 8 dígitos.");
		    }
		    
		}catch(IllegalArgumentException excep)
		{
		    System.out.println(excep.getMessage());
		}
	}
}
