package biblioteca;

import java.util.Scanner;

public class cadastrar_usuario {
	String nome_user;
	String cpf;
	String email;
	String telefone;
	
	Scanner input_texto = new Scanner(System.in);
	
	public void nome_usuario() {
		System.out.println("Digite seu nome completo: ");
		this.nome_user = input_texto.nextLine(); // salvar informação do usuario na string da linha 6
		
	}
	
	public void cpf() {
		// Regex para o formato 000.000.000-00
        String regexCPF = "^\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}$";
		
		while (true) {
			System.out.println("Digite seu CPF: ");
			String entrada = input_texto.nextLine();
			
			if (entrada.matches(regexCPF)) { // compara o cpf digitado pelo usuario com o padrao regex
				this.cpf = entrada; // se o cpf for válido, a inforamação digitada pelo usuario é salva na variável cpf
				break;
			}
			
			else {
				System.out.println("CPF inválido!");
			}
			
		}
		
	}
	
	public void email() {
		String regexEmail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		while (true) {
			System.out.println("Digite seu email: ");
			String entrada = input_texto.nextLine();
			
			if (entrada.matches(regexEmail)) { 
				this.email = entrada; 
				break;
			}
			
			else {
				System.out.println("Email inválido!");
			}
			
		}
		
	}
	
	public void telefone() {
		String regexTelefone = "^\\d{11}$";
		
		while (true) {
	        System.out.println("Digite seu telefone : ");
	        String entrada = input_texto.nextLine();
	        
	        if (entrada.matches(regexTelefone)) {
	            this.telefone = entrada;
	            break; 
	        } 
	        
	        else {
	            System.out.println("Telefone inválido! Certifique-se de digitar os 11 dígitos com o DDD.");
	        }
	    }
		
	}
	

}
