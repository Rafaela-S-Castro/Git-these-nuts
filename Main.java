package AvaliacaoC3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import AvaliacaoC3.Cliente;

public class Main {
	static StringBuffer memoria = new StringBuffer();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Cliente cliente = new Cliente();
		char opcao, resp = 'N';
		do {
			opcao = menu();
			switch (opcao) {

			case '1':

				cliente.inserirDadosCliente();
				break;
			case '2':

				cliente.alterarCliente();
				break;
			case '3':
				Funcionario funcionario = new Funcionario();
				funcionario.inserirDadosFuncionario();

				break;
			case '4':
				System.out.println("Deseja realmente sair do programa? S/N");
				resp = Character.toUpperCase(scan.next().charAt(0));

				break;

			default:
				System.out.println("opção invalida, tente novamente");
			}
		} while (resp != 'S');
		System.exit(0);
	}

	static char menu() {
		System.out.println("\n\nEscolha uma Opção:\n" + "1. Cadastrar novo cliente\n" + "2. Alterar dados do cliente\n"
				+ "3. Cadastrar novo Funcionário\n" + "4. Sair");
		return scan.next().charAt(0);
	}

}