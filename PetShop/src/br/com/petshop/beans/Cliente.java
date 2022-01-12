package br.com.petshop.beans;

// tudo que existe na PESSOA existe no Cliente+ as caracteristica individuais de CLIENTE
public class Cliente extends Pessoa{
	private String idCliente;

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	
	

}
