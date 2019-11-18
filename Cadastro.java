package TrabalhoC3;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cadastro {

Cliente cliente = new Cliente();
Funcionario funcionario = new Funcionario();

static int menu(){
	Scanner scan = new Scanner(System.in);

	System.out.println("1 - Tela do cliente");
	System.out.println("2 - Tela do funcionário");
	System.out.println("3 - Menu principal: ");
	System.out.println("Escolha a opção: ");
	return Integer.parseInt(scan.nextLine());
//colocar todos os metodos menu dentro de um menu
}
	
static int menuCliente(){
	Scanner scan = new Scanner(System.in);

	System.out.println("1 - Cadastrar cliente");
	System.out.println("2 - Alterar cadastro de cliente");
	System.out.println("3 - apagar cadastro de cliente: ");
	return Integer.parseInt(scan.nextLine());

}	
	
	
static int menuFuncionario(){
	Scanner scan = new Scanner(System.in);

	System.out.println("1 - Cadastrar funcionário");
	System.out.println("2 - apagar cadastro de funcionário");
	return Integer.parseInt(scan.nextLine());
}		
	
	

	
	// metodo cadastrar cliente
	public void cadastrarCliente(Cliente cliente) {
		PrintWriter arquivo = null;
		try {
		FileWriter out = new FileWriter("cadastroCliente.txt");
		arquivo = new PrintWriter(out); 
		arquivo.println(cliente);
		} catch (Exception e) {
		System.out.println(e);
		} finally {
		arquivo.close();
		}

	}
	
	//metodo alterar cadastro de cliente
	public void alterarCadastro() {
	
	}
	
	
	//metodo apagar cadastro de cliente
	public void apagarCliente() {
	
	}
	
	
	
	
	
	
}
