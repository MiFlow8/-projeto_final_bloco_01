package produto_capilar;

import java.util.Scanner;
import produto_capilar.model.Progressiva;
import produto_capilar.model.ProdutoCapilar;
import produto_capilar.controller.ProdutoController;

public class Menu {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
		 ProdutoController controller = new ProdutoController();
		 
			int opcao;
			
			while (true) {
				
				System.out.println("===========================================================");
				System.out.println("                   MILLY HAIR COSMETICS                    ");
				System.out.println("              E-commerce de Produtos Capilares             ");
				System.out.println("===========================================================");
				System.out.println("                                                           ");
				System.out.println("                 1 - Cadastrar Produto                     ");
				System.out.println("                 2 - Listar Produtos                       ");
				System.out.println("                 3 - Buscar Produto                        ");
				System.out.println("                 4 - Atualizar Produto                     ");
				System.out.println("                 5 - Excluir Produto                       ");
				System.out.println("                 0 - Sair                                  ");
				System.out.println("===========================================================");
				System.out.println(" Escolha a opção desejada:                                 ");
				System.out.println("                                                           ");                                                          

				opcao = leia.nextInt();
				 
				if(opcao == 0) {
					System.out.println("\nMilly Hair Cosmetics - agradece sua visita! Sistema encerrado.");
					sobre();
					leia.close();
					System.exit(0);
				}
				
				switch(opcao) {
				case 1:
					System.out.println("Cadastrando produto...");
					
					 ProdutoCapilar p = new Progressiva(1,"Escova Progressiva Nutri Liss",120.0, "Milly hair", "Sem formol");

					   controller.cadastrar(p);

					    break;
					
				case 2:
					System.out.println("Listar produtos...");
					controller.listar();
					break;
				case 3:
					System.out.println("Buscar produto...");
					break;
				case 4:
					System.out.println("Atualizar produto...");
					break;
				case 5:
					System.out.println("Excluir produto...");
					break;
				default:
					System.out.println("Opção inválida! ");
				
				}
			}
		}
	
	public static void sobre() {
		System.out.println("\n=================================================");
		System.out.println("Projeto Desenvolvido por: Milena Fernandes Silva ");
		System.out.println("Generation Brasil - milenafernandes829@gmail.com");
		System.out.println("https://github.com/MiFlow8                      ");                                               
		System.out.println("=================================================");
	}
		
	}


