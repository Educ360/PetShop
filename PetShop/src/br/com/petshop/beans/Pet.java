package br.com.petshop.beans;

public class Pet {
	
	private String idPet;
	private Cliente dono;
	private String nome;
	
	public String getIdPet() {
		return idPet;
	}
	public void setIdPet(String idPet) {
		this.idPet = idPet;
	}
	public Cliente getDono() {
		return dono;
	}
	public void setDono(Cliente dono) {
		this.dono = dono;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
