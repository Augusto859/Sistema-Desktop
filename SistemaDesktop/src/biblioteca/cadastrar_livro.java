package biblioteca;
import java.util.Scanner;

public class cadastrar_livro {
	public void nome_autor() {
		Scanner nome = new Scanner(System.in);
		System.out.println("Digite o nome do autor: ");
		String nome_autor = nome.nextLine();
		System.out.println(nome_autor);
			
	}

	public void nome_livro() {
		Scanner livro = new Scanner(System.in);
		System.out.println("Digite o nome do autor: ");
		String nome_livro = livro.nextLine();
		System.out.println(nome_livro);
	}
	
	public void data_publicacao() {
		Scanner data = new Scanner(System.in);
		System.out.println("Digite o ano de publicação: ");
		String data_publicacao = data.nextLine();
		System.out.println(data_publicacao);
		
	}
	
	public void descrição() {
		Scanner descricao = new Scanner(System.in);
		System.out.println("Descrição: ");
		String input_descricao = descricao.nextLine();
		System.out.println(input_descricao);
	}
}
