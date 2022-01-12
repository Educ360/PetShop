package br.com.petshop.beans;

//tudo que existe na PESSOA existe no Funcionario + as caracteristica individuais de FUNCIONARIO
public class Funcionario extends Pessoa{
	
	private String idFunc;
	private double salario;
	private String cargo;
	public String getIdFunc() {
		return idFunc;
	}
	public void setIdFunc(String idFunc) {
		this.idFunc = idFunc;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	

}
