package com.kaua.lista4ac2ex3;

public class Funcionario {

	    private String nome;
	    private String cargo;
	    private double salario;

	    public Funcionario(String nome, String cargo, double salario) {
	        this.nome = nome;
	        this.cargo = cargo;
	        this.salario = salario;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public String getCargo() {
	        return cargo;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    @Override
	    public String toString() {
	        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + salario;
	    }
	}