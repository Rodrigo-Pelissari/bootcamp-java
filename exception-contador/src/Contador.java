import java.util.Scanner;

public class Contador
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Vamos fazer uma contagem baseada no intervalor desejado.");
	    
		System.out.println("Digite o primeiro número do intervalo:");
		int numero1 = input.nextInt();
		System.out.println("Digite o primeiro segundo do intervalo:");
		int numero2 = input.nextInt();

		input.close();
		
		try{
		    contarIntervalo(numero1, numero2);
		}catch (ParametrosInvalidosException ex){
		    System.out.println("O segundo número digitado deve ser maior que o primeiro.");
		}
		
	}
	
	static void contarIntervalo(int valor1, int valor2) throws ParametrosInvalidosException{
	    if(valor1 > valor2){
	        throw new ParametrosInvalidosException();
	    }else{
	        
	        int contador = valor2 - valor1;
	        System.out.println("O intervalo selecionado é de " + contador + " números.");
	        System.out.print("Sequência: ");
	        
	        for(int i = 1; i <= contador; i++){
	            if(i < contador)
	            {
	              System.out.print(i + ", ");
	            }else{
	            System.out.println(i + ".");
	            }
	        }
	    }
	}
}
