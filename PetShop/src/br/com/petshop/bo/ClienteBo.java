package br.com.petshop.bo;

import br.com.petshop.beans.Cliente;
import br.com.petshop.beans.Endereco;

public class ClienteBo {

	public Cliente cadastraCliente(String nome, String cpf, String rua, int numero, String bairro, String cidade, String estado) {
		Cliente c = new Cliente();
		c.setNome(nome);
		c.setCpf(cpf);
		Endereco e = new Endereco();
		e.setRua(rua);
		e.setNumero(numero);
		e.setBairro(bairro);
		e.setCidade(cidade);
		e.setEstado(estado);
		c.setEndereco(e);
		
		return c;
	}
}
