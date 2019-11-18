package TrabalhoC3;

import java.util.Scanner;
import java.io.FileReader;
/*Rafaela Silva de Castro
 * Ana Clara Herbst
 * Lucas Anjos
 * Luciano
 */
public class Ler {
	// tamanho char/cor string/preço float
	public static void main(String[] args) {
		Scanner arquivo = null;
		try{
			FileReader in = new FileReader("produto2.txt");
			arquivo = new Scanner(in);
			int i = 0;
			String tamanho;
			String cor;
			String preco;
			while (i < 2){
			tamanho = arquivo.nextLine();
			cor = arquivo.nextLine();
			preco = arquivo.nextLine();
			System.out.println("Tamanho: "+tamanho+"| Cor: "+cor+"| Preço: "+preco);
			i++;
			}
		}catch(Exception e){
			System.out.println(e);
			
		}finally{
			arquivo.close();
		}
		

	}
}
