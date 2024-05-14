import java.util.Scanner;

public class LimiteSaques
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o valor do seu saldo bancário?");
		double saldo = input.nextDouble();
		
		System.out.println("Quantos saques diários você possui de limite?");
		int saques = input.nextInt();
		
		for(int i = 0; i < saques; i++)
		{
		    System.out.println("Qual valor você deseja sacar?");
		    double valor = input.nextDouble();
		    
		    if(valor <= saldo)
		    {
		        saldo -= valor;
		        System.out.println("Saque de R$" + valor + " efetuado com sucesso!\nSaldo atual: R$" + saldo);
		        if(saldo == 0)
		        {
		            break;
		        }
		    }else
		    {
		        System.out.println("Não é possível sacar R$" + valor + ".\nSaldo atual: R$" + saldo);
		    }
		}
		System.out.println("Seu limite de saques excedeu ou seu saldo está zerado, impossível realizar novos saques.");
	}
}
