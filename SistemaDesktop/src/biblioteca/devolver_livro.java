package biblioteca;

import java.util.ArrayList;

import java.util.Scanner;
import biblioteca.emprestar_livro;

public class devolver_livro {
	
	public boolean emprestado = false;
	
	
	public void pedir_titulo (ArrayList<cadastrar_livro> listaLivros) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o título do livro que está sendo devolvido: ");
		String titulo_digitado = entrada.nextLine();
		
		cadastrar_livro livro_encontrado = null;  
		
		for (cadastrar_livro livro: listaLivros) { // para cada livro (variavel temporaria) que esta na lista de livros
			if (livro.nome_livro.equalsIgnoreCase(titulo_digitado)) { // verifica se corresponde ao livro digitado pelo usuário
				livro_encontrado = livro; // salva o livro encontrado na variavel vazia da linha 19
				break;
			}
		}
		
		if (livro_encontrado != null) { // verifica se o livro existe
			if (livro_encontrado.emprestado == true) { // se sim, verifica se ele foi emprestado ou nao
				livro_encontrado.emprestado = false; // se foi emprestado (boolean == true) ele muda a condição do livro para false para confirmar
				System.out.println("O livro foi devolvido."); // que o livro foi devolvido no sistema
			}
			
			else {
				System.out.println("Esse livro não foi alugado."); // se o livro não foi emprestado (boolena == false) apenas avisa que o livro está disponível na pratelerira
				
			}
		}
		
		else {
			System.out.println("Livro não encontrado não encontrado no acervo");
		}				
	}	
}
