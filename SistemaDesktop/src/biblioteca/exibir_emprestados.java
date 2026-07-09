package biblioteca;

import biblioteca.emprestar_livro;
import biblioteca.cadastrar_livro;
import java.util.ArrayList;

public class exibir_emprestados {
	
	public void lista_emprestados(ArrayList<cadastrar_livro> listaLivros) {
		cadastrar_livro emprestados = null;
		
		for (cadastrar_livro e: listaLivros) {
			if (e.emprestado == true) {
				System.out.printf("%s%n", e.nome_livro);
			}
			
			else {
				System.out.println("Nenhum livro foi alugado ainda.");
			}
		}
	}
	
	
	
	
}
