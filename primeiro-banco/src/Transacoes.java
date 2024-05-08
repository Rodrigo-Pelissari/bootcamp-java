import java.util.Scanner;
import java.util.ArrayList;

public class Transacoes
{
	public static void main(String[] args) {
	    int opcao, numero=1;
        String primeiroNome, segundoNome;
        int numeroConta;
        int valor;
        ArrayList<ContaBanco> clientes = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo ao banco MoneyJava.");
        while(true)
        {
            System.out.println("Deseja: \n[1] Cadastrar um novo cliente\n[2]Realizar uma transação\n[3]Encerrar o aplicativo.");
            opcao = input.nextInt();

            if(opcao == 1)
            {
                System.out.println("Digite o primeiro nome do cliente: ");
                primeiroNome = input.next();
                System.out.println("Digite o sobrenome nome do cliente: ");
                segundoNome = input.next();

                ContaBanco conta = new ContaBanco(primeiroNome, segundoNome, numero);
                numero++;
                clientes.add(conta);
                

            }else if(opcao == 2)
            {
                while(true)
                {
                    System.out.println("Digite o número da sua conta (somente números).");
                    numeroConta = input.nextInt();

                    for(ContaBanco conta : clientes)
                    {
                        if(conta.getNumeroConta() == numeroConta)
                        {
                            while(true)
                            {
                                System.out.println("Deseja:\n[1]Checar seu saldo\n[2]Fazer um depósito\n[3]Fazer um Saque\n[4]Fazer uma transferência\n[5]Encerrar transações.");
                                opcao = input.nextInt();

                                if(opcao < 1 || opcao > 5)
                                {
                                    System.out.println("Opção inválida, digite novamente.");
                                }else if(opcao == 1)
                                {
                                    conta.checarSaldo();
                                    break;
                                }else if(opcao == 2)
                                {
                                    System.out.println("Qual o valor do depósito?");
                                    valor = input.nextInt();
                                    conta.depositarValor(valor);
                                    valor = 0;
                                    break;
                                }else if(opcao == 3)
                                {
                                    System.out.println("Qual o valor do saque?");
                                    valor = input.nextInt();
                                    conta.sacarValor(valor);
                                    valor = 0;
                                    break;
                                }else if(opcao == 4)
                                {
                                    break;
                                }else if(opcao == 5)
                                {
                                    break;
                                }
                            }
                        }else
                        {
                            System.out.println("Não foi encontrada nenhuma conta.");
                            break;
                        }
                    }   
                break;
                }
            }else if(opcao == 3)
            {
                break;
            }
        }

        input.close();
    }
}
