
public class Estoque {
	//Produto[]
			// int tamLogico
			// incluirRoupa()
			// excluirRoupa()
			// pesquisarRoupaPorCodigo()
			/// listarEstoque()
			int tamLogico = 0;
		
			Produto vet[] = new Produto[5];


			public void incluirRoupa(Produto produto) {
				if (tamLogico < vet.length) {
					vet[tamLogico] = produto;
					tamLogico++;
				}
			}

			public void excluirRoupaPorCodigo(int codigo) {
				for (int i = 0; i < tamLogico; i++) {
					if (vet[i].getCodigo() == vet[i].getCodigo()) {
						if (tamLogico == 1)
							;
						tamLogico--;
					} else {
						vet[i] = vet[tamLogico - 1];
						tamLogico--;
					}
				}
			}

			public void pesquisarRoupaPorCodigo(int codigo) {
				Produto produto = new Produto();
				//int codigo=0;
				for (int j = 0; j < tamLogico; j++) {
					if (vet[j].getCodigo() == codigo) {
						System.out.println(produto);

					}

				}
				//return ;
			}

			public Produto listarEstoque(Produto produto) {
				for (int i = 0; i < tamLogico; i++) {
					System.out.println(vet[i]);
				}
				return produto;
			}
		}

