package AvaliacaoC3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cliente {
	static StringBuffer memoria = new StringBuffer();
	static Scanner scan = new Scanner(System.in);
	private int codigo;
	private String nome;
	private String dataNascimento;
	private String genero;
	private String telefone;
	private String endereco;

	public String toString() {
		return this.codigo + "\t" + this.nome + "\t" + this.dataNascimento + "\t" + this.genero + "\t" + this.telefone
				+ "\t" + this.endereco + "\n";

	}

	public Cliente() {	}
	
	
	public Cliente(int codigo, String nome, String dataNascimento, String genero, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.codigo = codigo;
		this.genero = genero;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	static void iniciarArquivoCliente() {
		try {
			BufferedReader arqEntrada;
			arqEntrada = new BufferedReader(new FileReader("Cliente.txt"));
			String linha = "";
			memoria.delete(0, memoria.length());
			while ((linha = arqEntrada.readLine()) != null) {
				memoria.append(linha + "\n");
			}
			arqEntrada.close();
		} catch (FileNotFoundException erro) {
			System.out.println("\nArquivo nao encontrado");
		} catch (Exception e) {
			System.out.println("\nErro de Leitura !");
		}
	}

	public static void gravarCliente() {
		try {
			BufferedWriter arqSaida;
			arqSaida = new BufferedWriter(new FileWriter("Cliente.txt"));
			arqSaida.write(memoria.toString());
			arqSaida.flush();
			arqSaida.close();
		} catch (Exception e) {
			System.out.println("\nErro de gravacao!");
		}
	}

	public void inserirDadosCliente() {
		int codCliente;
		String nome, telefone, endereco, genero, dataNascimento;

		try {
			BufferedWriter saida;
			saida = new BufferedWriter(new FileWriter("Cliente.txt", true));

			System.out.println("Digite o código do cliente");
			codCliente = scan.nextInt();
			System.out.println("Digite o nome do cliente");
			nome = scan.next();
			System.out.println("Digite a data de nascimento do cliente");
			dataNascimento = scan.next();
			System.out.println("Digite o genero do cliente");
			genero = scan.next();
			System.out.println("Digite o telefone do cliente");
			telefone = scan.next();
			System.out.println("Digite o endereço do cliente");
			endereco = scan.next();
			Cliente reg = new Cliente(codCliente, nome, dataNascimento, genero, telefone, endereco);
			saida.write(reg.toString());
			saida.flush();
			saida.close();
		} catch (Exception e) {
			System.out.println("\nErro de gravacao");
		}
	}
	static void carregaStringBuffer(String Cliente) {
		try {
			BufferedReader cliente = new BufferedReader(new FileReader(Cliente));
			String linha = "";
			memoria.delete(0, memoria.length());
			while ((linha = cliente.readLine()) != null) {
				memoria.append(linha + "\n");
			}
			cliente.close();
		} catch (FileNotFoundException erro) {
			System.out.println("\nArquivo nao encontrado");
		} catch (IOException e) {
			System.err.println("\nErro de I/O");
		} catch (Exception e) {
			System.out.println("\nErro de Leitura !");
		}
	}
	public static void alterarCliente() {
		Scanner scan1 = new Scanner(System.in);
		String codigo, nome, telefone, endereco, dataNascimento, genero;
		int inicio, fim, ultimo, primeiro;
		boolean achou = false;
		int procura;
		iniciarArquivoCliente();
		if (memoria.length() != 0) {
			System.out.println("\nDigite o codigo para alteração:");
			procura = scan.nextInt();
			nome = "";
			telefone = "";
			endereco = "";
			dataNascimento = "";
			genero = "";
			inicio = 0;
			
			while ((inicio != memoria.length()) && (!achou)) {
				ultimo = memoria.indexOf("\t", inicio);
				codigo = memoria.substring(inicio, ultimo);
				primeiro = ultimo + 1;
				ultimo = memoria.indexOf("\t", primeiro);
				nome = memoria.substring(primeiro, ultimo);
				primeiro = ultimo + 1;
				ultimo = memoria.indexOf("\t", primeiro);
				telefone = memoria.substring(primeiro, ultimo);
				
				
				primeiro = ultimo + 1;
				fim = memoria.indexOf("\n", primeiro);
				endereco = memoria.substring(primeiro, fim);
				Cliente reg = new Cliente(Integer.parseInt(codigo), nome, dataNascimento, genero, telefone, endereco);
				if (procura == reg.getCodigo()) {
					System.out.println("\nCódigo: " + reg.getCodigo() + "  nome: " + reg.getNome()
							+ "  data de nascimento: " + reg.getDataNascimento() + "  genero: " + reg.getGenero()
							+ "telefone: " + reg.getTelefone() + "endereco: " + reg.getEndereco());
					System.out.println("Digite novo nome");
					nome = scan.next();
					reg.setNome(nome);
					System.out.println("Digite nova data");
					dataNascimento = scan.next();
					reg.setDataNascimento(dataNascimento);
					System.out.println("Digite novo genero");
					genero = scan.next();
					reg.setGenero(genero);
					System.out.println("Digite novo telefone");
					telefone = scan.next();
					reg.setTelefone(telefone);
					System.out.println("Digite novo endereco");
					endereco = scan.next();
					reg.setEndereco(endereco);
					memoria.replace(inicio, fim, reg.toString());
					gravarCliente();
					achou = true;
				}
				inicio = fim + 1;
			}
			if (achou) {
				System.out.println("\nalteração realizada com sucesso");
			} else {
				System.out.println("\ncódigo não encontrado");
			}
		} else {
			System.out.println("\narquivo vazio");
		}
	}



}
