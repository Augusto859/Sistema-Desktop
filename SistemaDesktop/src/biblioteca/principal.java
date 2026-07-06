package biblioteca;
import java.util.Scanner;
import biblioteca.cadastrar_livro;

public class principal {

	public static void main(String[] args) {
		System.out.println("1 - Cadastrar livro\n2 - Cadastrar usuário\n3 - Emprestar livro\n4 - Devovler livro\n5 - Consultar disponibilidade\n6 - Mostrar livros disponibilizados\n");
		Scanner input_texto = new Scanner(System.in);
		System.out.println("Selecione uma das opções acima: ");
		String nome = input_texto.nextLine();
		
		if (nome.equals("1")) {
			System.out.println("Código da primeira opção...");
			cadastrar_livro cadastro = new cadastrar_livro();
			
			
		}
		
		else if (nome.equals("2")) {
			System.out.println("Código da segunda opção...");
		}
		
		else if (nome.equals("3")) {
			System.out.println("Código da terceira opção...");
		}
		
		else if (nome.equals("4")) {
			System.out.println("Código da quarta opção...");
		}
		
		else if (nome.equals("5")) {
			System.out.println("Código da quinta opção...");
		}
		
		else if (nome.equals("6")) {
			System.out.println("Código da sexta opção...");
		}

		input_texto.close();
	}
	 

}
