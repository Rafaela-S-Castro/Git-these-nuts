
public class Produto {
	private String tamanho;
	private String cor;
	private float preco;
	private String tip;
	private char genero;
	private int codigo;

	// inicializarProduto
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Produto [tamanho=" + tamanho + ", cor=" + cor + ", preco=" + preco + ", tip=" + tip + ", genero="
				+ genero + ", codigo=" + codigo + "]";
	}

}
