import java.util.Scanner;

public class BancoSimples
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		String nome = "Fulano", sobrenome = "Beltrano";
		String agencia = "0389", numeroConta = "006785-2";
		double saldo = 0.0, valor;
		boolean continuarOperacoes = true;
		int opcao;
		
		System.out.println("Olá, " + nome + " " + sobrenome + ", bem vindo(a) ao banco MoneyJava.");
		System.out.println("Agência: " + agencia + " / " + "Conta: " + numeroConta);
		
		while(continuarOperacoes)
		{
		    System.out.println("Qual operação você deseja realizar?\n[1] Depositar\n[2] Sacar\n[3] Consultar saldo\n[4] Encerrar aplicativo.");
		    opcao = scanner.nextInt();
		    
		        switch(opcao)
		        {
		            case 1:
		                System.out.println("Qual o valor do depósito?");
		                valor = scanner.nextDouble();
		                saldo += valor;
		                System.out.println("Depósito efetuado.");
		                break;
		                
		            case 2:
		                System.out.println("Qual o valor do saque?");
		                valor = scanner.nextDouble();
		                if(saldo >= valor)
		                {
		                    saldo -= valor;
		                    System.out.println("Saque efetuado.");
		                    break;
		                }else
		                {
		                    System.out.println(nome + ", seu saldo é insuficiente para realizar essa transação.");
		                    break;
		                }
		                
		            case 3:
		                System.out.println(nome + ", seu saldo atual é de R$" + saldo);
		                break;
		                
		            case 4:
						System.out.println("Encerrando Transações.");
		                continuarOperacoes = false;
		                break;
		                
		                
		            default:
		                System.out.println("Olá.");
		                break;
		                    
		        }
		}
		scanner.close();
	}
}
