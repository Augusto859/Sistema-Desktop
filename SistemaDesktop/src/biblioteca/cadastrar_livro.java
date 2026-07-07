package biblioteca;
import java.util.Scanner;

public class cadastrar_livro {
	public String nome_autor;
	public String nome_livro;
	public String data_publicacao;
	public String sinopse;
	public double preco;
	
	public void nome_autor() {
		Scanner nome = new Scanner(System.in);
		System.out.println("Digite o nome do autor: ");
		this.nome_autor = nome.nextLine(); // Salva na variável do topo
					
	}

	public void nome_livro() {
		Scanner livro = new Scanner(System.in);
		System.out.println("Digite o nome do livro: ");
		this.nome_livro = livro.nextLine();
		
	}
	
	public void data_publicacao() {
		Scanner publicacao = new Scanner(System.in);
		System.out.println("Digite o ano de publicação: ");
		this.data_publicacao = publicacao.nextLine();
		
	}
	
	public void sinopse() {
		Scanner sinopse = new Scanner(System.in);
		System.out.println("Descrição: ");
		this.sinopse = sinopse.nextLine();
	}
	
	public void preco() {
		Scanner preco = new Scanner(System.in);
		System.out.println("Preço: ");
		this.preco = preco.nextDouble();
	}


}
