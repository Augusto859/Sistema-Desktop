package biblioteca;

import java.util.Scanner;


import biblioteca.cadastrar_livro;
import biblioteca.consultar_disponibilidade;
import biblioteca.cadastrar_usuario;
import biblioteca.emprestar_livro;
import biblioteca.devolver_livro;
import java.util.ArrayList;
import biblioteca.exibir_emprestados;

public class principal {

	public static void main(String[] args) {
		ArrayList<cadastrar_livro> listaLivros = new ArrayList<>(); // armazena os livros cadastrados em uma lista
		ArrayList<cadastrar_usuario> listaUsers = new ArrayList<>(); // armazena os usuarios cadastrados em uma lista
		
		
		cadastrar_usuario usuario_teste = new cadastrar_usuario();
		
		usuario_teste.nome_user = "Dennis";
		usuario_teste.cpf = "12345678900";
		usuario_teste.email = "emailfalso@gmail.com";
		usuario_teste.telefone = "080808080808";
		listaUsers.add(usuario_teste);
		
		
		cadastrar_livro livro_teste = new cadastrar_livro();
		
		livro_teste.nome_autor = "Machado de Assis";
		livro_teste.nome_livro = "Dom Casmurro";
		livro_teste.data_publicacao = "1899";
		livro_teste.sinopse = "A clássica história sobre Bentinho e Capitu";
		livro_teste.preco = 775.00;
		listaLivros.add(livro_teste);
		
	
		Scanner input_texto = new Scanner(System.in);
		String opcao;
		
		do {
			System.out.println("\n=== MENU PRINCIPAL ===");
			System.out.println("1 - Cadastrar livro\n2 - Cadastrar usuário\n3 - Empréstimo\n4 - Devovler livro\n5 - Consultar disponibilidade\n6 - Exibir livros emprestados\n7 - Sair do sistema\n");
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
					
					listaUsers.add(cadUser);
					
					System.out.println("\n[1] Cadastrar outro usuário");
			        System.out.println("[2] Voltar para o menu principal");
			        System.out.print("Escolha uma opção: ");
			        continuar_cadastro_usuario = input_texto.nextLine();
					
				} while (continuar_cadastro_usuario.equals("1"));
			}

			else if (opcao.equals("3")) {
				emprestar_livro emprestimo = new emprestar_livro();
				
				emprestimo.confirmar_dados(listaUsers, listaLivros);
			}

			else if (opcao.equals("4")) {
				devolver_livro devolucao = new devolver_livro();
				devolucao.pedir_titulo(listaLivros);
			}

			else if (opcao.equals("5")) {
				System.out.println("=== Lista de livros ===");
				if (listaLivros.isEmpty()) {
					System.out.println("Nenhum livro cadastrado.");
				} 
				
				else {
					for (cadastrar_livro b: listaLivros) { // para cada livro disponivel na lista
						if (b.emprestado == true) { // verifica se ele foi emprestado
							System.out.printf("Livro: %s%nStatus: EMPRESTADO", b.nome_livro);
						}
						
						else {
							System.out.printf("Livro: %s%nStatus: DISPONÍVEL", b.nome_livro);
						}
					}
				}
			}

			else if (opcao.equals("6")) {
				exibir_emprestados emprestado = new exibir_emprestados();
				emprestado.lista_emprestados(listaLivros);
			}
			
		} while (!opcao.equals("7")); 
		
		System.out.println("\nSistema encerrado. Até mais!");
		input_texto.close();
	}
}