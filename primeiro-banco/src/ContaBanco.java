public class ContaBanco {
    String nomeCliente, sobrenomeCliente;
    double saldo;
    int agencia = 3402;
    int numeroConta;
    
    //métodos para criação de uma nova conta bancária
    public ContaBanco(String nome, String sobrenome, int numero)
    {
        numeroConta = numero;
        nomeCliente = nome;
        sobrenomeCliente = sobrenome;
        saldo = 0;

        System.out.println("\nConta aberta com sucesso!\nNome do cliente: " + nomeCliente + " " + sobrenomeCliente + "\nAgência: " + agencia + "\nNúmero da conta: " + numeroConta + ".\nSaldo atual: " + saldo + "\n");
    }
    
    //Transações
    public double depositarValor(double valor)
    {
        saldo += valor;
        System.out.println(nomeCliente + " " + sobrenomeCliente + ", você depositou R$" + valor + " com sucesso!\n");
        return saldo;
    }
    
    public double sacarValor(double valor)
    {
        if(valor == 0)
        {
            System.out.println(nomeCliente + " " + sobrenomeCliente + ", só é possível sacar valores maiores que R$0.\n");
        }else
        {
            if(valor > saldo)
            {
                System.out.println(nomeCliente + " " + sobrenomeCliente + ", sua conta não possui o valor que deseja sacar.\n");
            }else
            {
                saldo -= valor;
                System.out.println(nomeCliente + " " + sobrenomeCliente + ", você sacou R$" + valor + "\n");
            }
        }

        return saldo;
    }
    
    public void transferirValor(double valor, ContaBanco cliente)
    {
        if(valor > 0)
        {
            if(this.saldo >= valor)
            {
            this.saldo -= valor;
            cliente.saldo += valor;
            System.out.println("Você transferiu R$" + valor + " para " + cliente.nomeCliente + " " + cliente.sobrenomeCliente + ".\n");
            }else{
            System.out.println(nomeCliente + " " + sobrenomeCliente + ", seu saldo é insuficiente.\n");
            }
        }else
        {
            System.out.println(nomeCliente + " " + sobrenomeCliente + ", você só pode transferir valores maiores que R$0.\n");
        }
    }
    
    //gets
    public void checarSaldo()
    {
        System.out.println(nomeCliente + " " + sobrenomeCliente + ", seu saldo é de: R$" + saldo + "\n");
    }

    public int getNumeroConta()
    {
        return numeroConta;
    }
}