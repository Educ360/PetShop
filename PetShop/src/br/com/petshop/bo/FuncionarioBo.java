package br.com.petshop.bo;

import br.com.petshop.beans.Cliente;
import br.com.petshop.beans.Endereco;
import br.com.petshop.beans.Funcionario;
import br.com.petshop.beans.Pet;
import br.com.petshop.beans.Produto;

public class FuncionarioBo {
	Funcionario f;
	Cliente c;
	Produto p;
	Pet pet;
	
	public Funcionario cadastraFuncionario(String nome, String cpf, String rua, int numero, String bairro, String cidade, String estado, double salario, String cargo) {
		 f = new Funcionario();
		
		f.setNome(nome);
		f.setCpf(cpf);
		Endereco e = new Endereco();
		e.setRua(rua);
		e.setNumero(numero);
		e.setBairro(bairro);
		e.setCidade(cidade);
		e.setEstado(estado);
		f.setEndereco(e);
		f.setSalario(salario);
		f.setCargo(cargo);
		
		return f;
	}
	
	public void vendaProduto(Funcionario f, Cliente c, Produto p) {
		this.f = f;
		this.c = c;
		this.p = p;
	}
	
	public void banhoDoguinho(Funcionario f, Pet pet) {
		this.f = f;
		this.pet = pet;
	}

}
