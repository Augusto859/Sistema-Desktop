package biblioteca;

import java.util.Scanner;
import biblioteca.cadastrar_livro;
import biblioteca.consultar_disponibilidade;
import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		ArrayList<cadastrar_livro> listaLivros = new ArrayList<>();
		
		System.out.println("1 - Cadastrar livro\n2 - Cadastrar usuário\n3 - Emprestar livro\n4 - Devovler livro\n5 - Consultar disponibilidade\n6 - Mostrar livros disponibilizados\n");
		Scanner input_texto = new Scanner(System.in);
		System.out.println("Selecione uma das opções acima: ");
		String opcao = input_texto.nextLine();
		
		
		
		
		if (opcao.equals("1")) {
			String continuar_cadastro;
			
			do {
				cadastrar_livro cadastro = new cadastrar_livro();
				cadastro.nome_autor();
				cadastro.nome_livro();
				cadastro.data_publicacao();
				cadastro.sinopse();
				cadastro.preco();
	
				System.out.println("\n--- LIVRO CADASTRADO COM SUCESSO ---");
				System.out.printf("Título: %s%n", cadastro.nome_autor);
				System.out.printf("Autor: %s%n", cadastro.nome_livro);
				System.out.printf("Ano: %s%n", cadastro.data_publicacao);
				System.out.printf("Sinopse: %s%n", cadastro.sinopse);
				System.out.printf("Preço: R$%.2f%n", cadastro.preco);
				System.out.println("------------------------------------");
				
				listaLivros.add(cadastro);
				
				System.out.println("\n[1] Cadastrar outro livro");
		        System.out.println("[2] Voltar para o menu principal");
		        System.out.print("Escolha uma opção: ");
		        continuar_cadastro = input_texto.nextLine();
		        
		        while (!continuar_cadastro.equals("1") && !continuar_cadastro.equals("2")) {
		            System.out.println("\nDigite um número das opções acima!\n");
		            
		            System.out.println("[1] Cadastrar outro livro");
		            System.out.println("[2] Voltar para o menu principal");
		            System.out.print("Escolha uma opção válida: ");
		            continuar_cadastro = input_texto.nextLine(); // Pede para digitar novamente
		        }
		        
			} while (continuar_cadastro.equals("1"));
		}

		else if (opcao.equals("2")) {
			System.out.println("Código da segunda opção...");
		}

		else if (opcao.equals("3")) {
			System.out.println("Código da terceira opção...");
		}

		else if (opcao.equals("4")) {
			System.out.println("Código da quarta opção...");
		}

		else if (opcao.equals("5")) {
			System.out.println("Código da quinta opção...");
			if (listaLivros.isEmpty()) {
				System.out.println("Nenhum livro cadastrado");
			}
			
			else {
				for (cadastrar_livro livro: listaLivros) {
					System.out.printf("Título: %s%nAutor: %s%n", livro.nome_livro, livro.nome_autor);
				}
			}
		}

		else if (opcao.equals("6")) {
			System.out.println("Código da sexta opção...");
		}

		input_texto.close();
	}

}
