package biblioteca;
import java.util.ArrayList;
import java.util.Scanner;
import biblioteca.cadastrar_livro;

public class consultar_disponibilidade {
	
		public void verificar(ArrayList<cadastrar_livro> listaLivros) {
			Scanner input = new Scanner(System.in);
			System.out.println("Digite o nome do livro que deseja consultar: ");
			String livro_procurado = input.nextLine();
			
			boolean encontrado = false;
			
			cadastrar_livro livroAchado = null;
			
			for (cadastrar_livro livro: listaLivros) {
				if (livro.nome_livro.equalsIgnoreCase(livro_procurado)) {
					encontrado = true;
					livroAchado = livro;
					break;
				}
			}
			
			if (encontrado) {
				System.out.println("\n--- LIVRO DISPONÍVEL ---");
				// Agora sim, printamos os dados REAIS do livro que estava guardado na lista
				System.out.printf("Título: %s%n", livroAchado.nome_livro);
				System.out.printf("Autor: %s%n", livroAchado.nome_autor);
				System.out.printf("Ano: %s%n", livroAchado.data_publicacao);
			}
			
			else {
				System.out.println("Nenhum resultado encontrado :(");
			}
		}		
	
}
