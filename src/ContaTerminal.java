import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception{
	    int numero = 0;
	    String agencia = null;
	    String nomeCliente = null;
	    double saldo = 0;
	    
		//TODO: Conhecer e importar a classe Scanner
		Scanner scanner = new Scanner(System.in);
		
		//Exibir as mensagens para o nosso usuário e Obter pela scanner os valores digitados no terminal
		System.out.println("Por favor, digite o número da Agência"); 
		numero = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Por favor, digite a Agência"); 
		agencia = scanner.nextLine();
		System.out.println("Por favor, digite o Nome do Cliente"); 
		nomeCliente = scanner.nextLine();
		System.out.println("Por favor, digite o Saldo do Cliente"); 
		saldo = scanner.nextDouble();
		scanner.close();
		//Exibir a mensagem conta criada
	    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque.");
	
	}

}
