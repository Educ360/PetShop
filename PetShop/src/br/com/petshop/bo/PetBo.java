package br.com.petshop.bo;

import br.com.petshop.beans.Cliente;
import br.com.petshop.beans.Pet;

public class PetBo {
	
	public Pet cadastraPet(String nome, Cliente dono) {
		Pet pet = new Pet();
		pet.setNome(nome);
		pet.setDono(dono);
		
		return pet;
		
	}

}
