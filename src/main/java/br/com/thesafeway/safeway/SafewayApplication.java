package br.com.thesafeway.safeway;
import br.com.thesafeway.safeway.Modelos.Cliente;
import br.com.thesafeway.safeway.Modelos.Empresa;
import br.com.thesafeway.safeway.Uteis.ValidaCNPJ;
import br.com.thesafeway.safeway.Uteis.ValidaCPF;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SafewayApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SafewayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		String CNPJ;
		String CPF;
		Scanner ler = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Empresa empresa	= new Empresa();


        int opcao = 0;
		String menu = """
                ** Digite sua opcão **
                1 - Pessoa Física
                2 - Pessoa Jurídica
                3 - Sair
                """;


		while (opcao != 3) {
			System.out.println(menu);
			opcao = ler.nextInt();

			switch (opcao){
				case 1:
					System.out.println("Digite seu Nome e Sobrenome:");
					cliente.setNomeCliente(ler.next());
					System.out.println("Digite seu telefone com DDD:");
					cliente.setTelefone(ler.next());
					System.out.println("Digite seu email:");
					cliente.setEmail(ler.next());
					System.out.println("Digite seu CPF:");
					CPF = ler.next();
					System.out.printf("\nResultado: ");
					if (ValidaCPF.isCpf(CPF) == true)
						System.out.printf("Acesso autorizado!");
					else System.out.printf("CPF invalido !!!\n");
					break;
				case 2:
					System.out.println("Digite o nome da Empresa:");
					empresa.setNomeEmpresa(ler.next());
					System.out.println("Digite o CNPJ:");
					CNPJ = ler.next();
					System.out.printf("\nResultado: ");
					if (ValidaCNPJ.isCNPJ(CNPJ) == true)
						System.out.printf("Acesso autorizado!");
					else System.out.printf("CNPJ inválido!\n");
					break;
				default:
					System.out.println("Obrigado! Até a próxima!");

			}
		}
	}

}




