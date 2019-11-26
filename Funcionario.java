package AvaliacaoC3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Funcionario {
	static StringBuffer memoria = new StringBuffer();
	static Scanner scan = new Scanner(System.in);
	private int codigo;
	private String nome;
	private String dataNascimento;
	private String genero;

	
	
	
	
	
	public Funcionario() {
		
	}

	public String toString() {
		return this.codigo + "\t" + this.nome + "\t" + this.dataNascimento + "\t" + this.genero + "\n";

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Funcionario(int codigo, String nome, String dataNascimento, String genero) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;

	}

	static void iniciarArquivoFuncionario() {
		try {
			BufferedReader arqEntrada;
			arqEntrada = new BufferedReader(new FileReader("Funcionario.txt"));
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

	public static void gravarFuncionario() {
		try {
			BufferedWriter arqSaida;
			arqSaida = new BufferedWriter(new FileWriter("Funcionario.txt"));
			arqSaida.write(memoria.toString());
			arqSaida.flush();
			arqSaida.close();
		} catch (Exception e) {
			System.out.println("\nErro de gravacao!");
		}
	}

	public void inserirDadosFuncionario() {
		int codFuncionario;
		String nome, genero, dataNascimento;

		try {
			BufferedWriter saida;
			saida = new BufferedWriter(new FileWriter("Funcionario.txt", true));

			System.out.println("Digite o código do funcionario");
			codFuncionario = scan.nextInt();
			System.out.println("Digite o nome do funcionario");
			nome = scan.next();
			System.out.println("Digite a data de nascimento do funcionario");
			dataNascimento = scan.next();
			System.out.println("Digite o genero do funcionario");
			genero = scan.next();

			Funcionario reg = new Funcionario(codFuncionario, nome, dataNascimento, genero);
			saida.write(reg.toString());
			saida.flush();
			saida.close();
		} catch (Exception e) {
			System.out.println("\nErro de gravacao");
		}
	}

	

}
