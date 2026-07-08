package biblioteca;

import java.util.Scanner;

import biblioteca.cadastrar_livro;
import biblioteca.consultar_disponibilidade;
import biblioteca.cadastrar_usuario;
import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		ArrayList<cadastrar_livro> listaLivros = new ArrayList<>();
	
		Scanner input_texto = new Scanner(System.in);
		String opcao;
		
		do {
			System.out.println("\n=== MENU PRINCIPAL ===");
			System.out.println("1 - Cadastrar livro\n2 - Cadastrar usuário\n3 - Emprestar livro\n4 - Devovler livro\n5 - Consultar disponibilidade\n6 - Mostrar livros disponibilizados\n7 - Sair do sistema\n");
			System.out.println("Selecione uma das opções acima: ");
			opcao = input_texto.nextLine();
			
			if (opcao.equals("1")) {
				String continuar_cadastro;
				
				do {
					cadastrar_livro cadastro = new cadastrar_livro();
					cadastro.nome_autor();
					cadastro.nome_livro();
					cadastro.data_publicacao();
					cadastro.sinopse(); // ou cadastro.descricao(); ajuste conforme sua classe
					cadastro.preco();
		
					System.out.println("\n--- LIVRO CADASTRADO COM SUCESSO ---");
					
					System.out.printf("Título: %s%n", cadastro.nome_livro);
					System.out.printf("Autor: %s%n", cadastro.nome_autor);
					System.out.printf("Ano: %s%n", cadastro.data_publicacao);
					System.out.printf("Sinopse: %s%n", cadastro.sinopse); 
					System.out.printf("Preço: R$ %.2f%n", cadastro.preco);
					System.out.println("------------------------------------");
					
					listaLivros.add(cadastro);
					
					System.out.println("\n[1] Cadastrar outro livro");
			        System.out.println("[2] Voltar para o menu principal");
			        System.out.print("Escolha uma opção: ");
			        continuar_cadastro = input_texto.nextLine();
			        
			        while (!continuar_cadastro.equals("1") && !continuar_cadastro.equals("2")) {
			            System.out.println("[1] Cadastrar outro livro");
			            System.out.println("[2] Voltar para o menu principal");
			            System.out.println("\nDigite um número das opções acima!\n");
			            continuar_cadastro = input_texto.nextLine();
			        }
			        
				} while (continuar_cadastro.equals("1"));
			}

			else if (opcao.equals("2")) {
				
				String continuar_cadastro_usuario; 
				
				do {
					cadastrar_usuario cadUser = new cadastrar_usuario();
					
					cadUser.nome_usuario();
					cadUser.cpf();
					cadUser.email();
					cadUser.telefone();
					
					System.out.println("------USUÁRIO CADASTRADO COM SUCESSO------");
					System.out.printf("Nome completo: %s%n", cadUser.nome_user);
					System.out.printf("CPF: %s%n", cadUser.cpf);
					System.out.printf("Email: %s%n", cadUser.email);
					System.out.printf("Telefone: %s%n", cadUser.telefone);
					
					
					System.out.println("\n[1] Cadastrar outro usuário");
			        System.out.println("[2] Voltar para o menu principal");
			        System.out.print("Escolha uma opção: ");
			        continuar_cadastro_usuario = input_texto.nextLine();
					
				} while (continuar_cadastro_usuario.equals("1"));
			}

			else if (opcao.equals("3")) {
				System.out.println("Código da terceira opção...");
			}

			else if (opcao.equals("4")) {
				System.out.println("Código da quarta opção...");
			}

			else if (opcao.equals("5")) {
				System.out.println("=== Lista de livros ===");
				if (listaLivros.isEmpty()) {
					System.out.println("Nenhum livro cadastrado.");
				} else {
					
					for (cadastrar_livro livro: listaLivros) {
						System.out.printf("Título: %s | Autor: %s%n", livro.nome_livro, livro.nome_autor);
					}
				}
			}

			else if (opcao.equals("6")) {
				System.out.println("Código da sexta opção...");
			}
			
		} while (!opcao.equals("7")); 
		
		System.out.println("\nSistema encerrado. Até mais!");
		input_texto.close();
	}
}