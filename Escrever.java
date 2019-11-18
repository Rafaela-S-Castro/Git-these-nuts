package TrabalhoC3;
/*Rafaela Silva de Castro
 * Ana Clara Herbst
 * Lucas Anjos
 * Luciano
 */
import java.io.FileWriter; //gera arquivo de texto
import java.io.PrintWriter;//escreve no arquivo de texto

public class Escrever {
	// tamaho char/cor string/preço float
	public static void main(String[] args) {
		PrintWriter arquivo = null;
		Produto produto1 = new Produto('P', "Vermelho", 43.2);
		Produto produto2 = new Produto('M', "Azul", 23.4);
		try {
			FileWriter in = new FileWriter("produto2.txt");
			arquivo = new PrintWriter(in);
			arquivo.println(produto1.getTamanho());
			arquivo.println(produto1.getCor());
			arquivo.println(produto1.getPreco());
			arquivo.println(produto2.getTamanho());
			arquivo.println(produto2.getCor());
			arquivo.println(produto2.getPreco());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			arquivo.close();
		}
	}

}
