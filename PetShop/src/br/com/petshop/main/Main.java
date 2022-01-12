package br.com.petshop.main;

import java.util.Scanner;

import br.com.petshop.beans.Cliente;
import br.com.petshop.beans.Pessoa;
import br.com.petshop.bo.ClienteBo;
import br.com.petshop.bo.FuncionarioBo;
import br.com.petshop.bo.PetBo;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
			
		ClienteBo cbo = new ClienteBo();
		//String nome, String cpf, String rua, int numero, String bairro, String cidade, String estado
		System.out.println("Insira seu nome");
		String nome = s.next();
		System.out.println("Insira cpf");
		String cpf = s.next();
		System.out.println("ENDEREÇO:");
		System.out.println("Insira rua");
		s.next();
		String rua = s.nextLine();
		System.out.println("Insira numero");
		int num = s.nextInt();
		System.out.println("Insira bairro");
		String bairro = s.next();
		System.out.println("Insira cidade");
		String cidade = s.next();
		System.out.println("Insira estado");
		String estado = s.next();
		
		Cliente cli = cbo.cadastraCliente(nome, cpf, rua, num, bairro, cidade, estado);
		
		//cbo.cadastraCliente("Karen", "409927254564", "Rua dos Bobos", 0, "Belem", "Belem", "Para");
		
		PetBo pbo = new PetBo();
		
		System.out.println("Insira o nome do pet");
		String nomePet = s.next();
		
		pbo.cadastraPet(nomePet, cli);
		
		FuncionarioBo fbo = new FuncionarioBo();
		System.out.println("Insira seu nome");
		String nomeF = s.next();
		System.out.println("Insira cpf");
		String cpfF = s.next();
		System.out.println("ENDEREÇO:");
		System.out.println("Insira rua");
		s.next();
		String ruaF = s.nextLine();
		System.out.println("Insira numero");
		int numF = s.nextInt();
		System.out.println("Insira bairro");
		String bairroF = s.next();
		System.out.println("Insira cidade");
		String cidadeF = s.next();
		System.out.println("Insira estado");
		String estadoF = s.next();
		System.out.println("Insira salario");
		double salario = s.nextDouble();
		System.out.println("Insira cargo");
		String cargo = s.next();
		
		//String nome, String cpf, String rua, int numero, String bairro, String cidade, String estado, double salario, String cargo
		fbo.cadastraFuncionario(nomeF, cpfF, ruaF, numF, bairroF, cidadeF, estadoF, salario, cargo);
	
	
	}

}
