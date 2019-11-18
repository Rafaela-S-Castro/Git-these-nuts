package TrabalhoC3;
/*Rafaela Silva de Castro
 * Ana Clara Herbst
 * Lucas Anjos
 * Luciano
 */
public class Produto {
	private char tamanho;
	private String cor;
	private double preco;

	public Produto(char tamanho, String cor, double preco) {
		super();
		this.tamanho = tamanho;
		this.cor = cor;
		this.preco = preco;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
