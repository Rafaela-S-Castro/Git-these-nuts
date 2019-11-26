import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileReader;

public class LeGravaEstoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		Produto produto = new Produto();
		PrintWriter arquivoProdutoW = null;
		int codigo;

		try {
			FileWriter out = new FileWriter("Estoque.txt");
			arquivoProdutoW = new PrintWriter(out);
			System.out.printf("Informe o codigo da roupa, -1 para encerrar:\n");
			codigo = Integer.parseInt(ler.nextLine());

			while (codigo != -1) {
				produto.setCodigo(codigo);
				System.out.printf("Informe o tamanho da roupa:\n");
				produto.setTamanho(ler.nextLine());
				System.out.printf("Informe a cor da roupa:\n");
				produto.setCor(ler.nextLine());
				System.out.printf("\nInforme o preço da roupa: ");
				produto.setPreco(Integer.parseInt(ler.nextLine()));
				System.out.printf("Informe o tipo da roupa: ");
				produto.setTip(ler.nextLine());
				System.out.printf("Informe o genero da roupa: ");
				produto.setGenero(ler.nextLine());

				arquivoProdutoW.println(produto.getCodigo() + "-" + produto.getTamanho() + "-" + produto.getCor() + "-"
						+ produto.getPreco() + "-" + produto.getTip() + "-" + produto.getGenero());

				System.out.printf("Informeo codigo da roupa, -1 para encerrar:\n");
				codigo = Integer.parseInt(ler.nextLine());

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			arquivoProdutoW.close();
		}
		String linha;
		Scanner arquivoProdutoR = null;
		try {
			FileReader in = new FileReader("Estoque.txt");
			arquivoProdutoR = new Scanner(in);

			while (arquivoProdutoR.hasNext()) {
				// faz algo com a linha
				linha = arquivoProdutoR.nextLine();
				String[] valorComSplit = linha.split("-");

				for (String s : valorComSplit) {
					System.out.print(s.trim() + "\t");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			arquivoProdutoR.close();
		}
	}

}
