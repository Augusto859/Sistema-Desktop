package biblioteca;

import java.util.ArrayList; 
import java.util.Scanner;


public class emprestar_livro {
    
	public boolean emprestado = false;
	
    public void confirmar_dados(ArrayList<cadastrar_usuario> listaUsuarios, ArrayList<cadastrar_livro> listaLivros) {
        Scanner entrada = new Scanner(System.in);
        
        
        
        cadastrar_usuario usuario_encontrado = null;
        
        
        // 1. LOOP DO CPF: Fica preso aqui até digitar um CPF válido
        while (true) {
            System.out.print("Digite o CPF do usuário para confirmação: ");
            String cpf_digitado = entrada.nextLine();
            
            // Busca na lista
            for (cadastrar_usuario u : listaUsuarios) {
                if (u.cpf.equalsIgnoreCase(cpf_digitado)) {
                    usuario_encontrado = u;                  
                    break;
                }
            }
            
            // Se encontrou, sai do loop do CPF
            if (usuario_encontrado != null) {
                System.out.println("Usuário confirmado: " + usuario_encontrado.nome_user);
                break; 
            } 
            
            else {
                System.out.println("Erro: CPF não encontrado no sistema! Tente novamente.");
            }
        }
        
        cadastrar_livro livro_encontrado = null;
        
        // 2. LOOP DO LIVRO: Fica preso aqui até digitar um título correto
        while (true) {
            System.out.print("\nDigite o título do livro: ");
            String titulo_digitado = entrada.nextLine();
            
            // Busca na lista
            for (cadastrar_livro livro : listaLivros) {
                if (livro.nome_livro.equalsIgnoreCase(titulo_digitado)) {
                	livro_encontrado = livro;
                    break;
                }
            }
            
            // Se encontrou, sai do loop do Livro
            if (livro_encontrado != null) {
            	if (livro_encontrado.emprestado == true) {
            		System.out.println("Esse livro já foi alugado. Tente de novo quando tiver sido devolvido.");
            		break;
            	}
            	
            	else {
            		
            		// 3. FINALIZAÇÃO DO EMPRÉSTIMO (Só chega aqui se o CPF e o Livro estiverem certos)
                    System.out.println("\nEmpréstimo realizado com sucesso!");
                    System.out.printf("Livro: %s%n", livro_encontrado.nome_livro);
                    System.out.printf("Retirado por: %s%n", usuario_encontrado.nome_user);
                    System.out.println("Prazo de devolução: 1 mês");
            		break; // Livro encontrado, sai do loop
            	}
            	                                             
            } 
            
            
            else {
                System.out.println("Erro: Livro não encontrado no acervo! Tente novamente.");
            }
        }
        
        
        
        livro_encontrado.emprestado = true; // o livro pedido pelo usuário tem sua condição de emprestado alterada para verdadeiro
        
    }
}