package TrabalhoC3;

import java.util.Scanner;

public class Cliente extends Pessoa {

	//atributos
	private String endereco;
	private String telefone;
	
	//toString
	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", telefone=" + telefone + ", nome=" + nome + ", dataNascimento="
				+ dataNascimento + ", codigo=" + codigo + ", genero=" + genero + ", toString()=" + super.toString()
				+ ", getNome()=" + getNome() + ", getDataNascimento()=" + getDataNascimento() + ", getCodigo()="
				+ getCodigo() + ", getGenero()=" + getGenero() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	public Cliente(String nome, String dataNascimento, int codigo, char genero, String endereco, String telefone) {
		super(nome, dataNascimento, codigo, genero);
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public Cliente() {
		super();
	}



	//get and set
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//metodo inicializar cliente
		public Cliente inicializarCliente() {
			
		Scanner scan = new Scanner(System.in);
			System.out.println("##Cadastro de cliente##");
			System.out.println("digite o nome do cliente: ");
			 nome = scan.nextLine();
			System.out.println("Digite a data de nascimento: ");
			dataNascimento = scan.nextLine();
			System.out.println("Digite o codigo do cliente: ");
			codigo = scan.nextInt();
			System.out.println("Digite o genero do cliente: ");
			genero = scan.nextLine().charAt(0);
			System.out.println("Digite o endereço do cliente: ");
			endereco = scan.nextLine();
			System.out.println("Digite o telefone do cliente: ");
			telefone = scan.nextLine();
			
			Cliente cliente = new Cliente(nome, dataNascimento, codigo, genero, endereco, telefone);
			return cliente;
		
		}

		
	
}
