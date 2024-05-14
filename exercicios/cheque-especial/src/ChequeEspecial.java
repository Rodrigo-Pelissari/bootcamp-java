import java.util.Scanner;

public class ChequeEspecial
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double chequeEspecial = 500.0;
		
		System.out.println("Caro cliente, digite o saldo atual de sua conta bancária.");
		double saldo = input.nextDouble();
		double limiteCheque = saldo + chequeEspecial;
		
		System.out.println("Quanto você deseja sacar?");
		double valor = input.nextDouble();
		
		if(valor <= saldo)
		{
		    saldo -= valor;
		    System.out.println("Saque realizado com sucesso!\nSaldo atual: R$" + saldo);
		}else
		{
		    if(valor <= limiteCheque)
		    {
		        System.out.println("O saque foi realizado utilizando seu Cheque Especial.\nSaldo atual: " + (saldo - valor));
		    }else
		    {
		        System.out.println("O valor desejado ultrapassa o limite do seu Cheque Especial. Operação recusada.");
		    }
		}
	}
}
