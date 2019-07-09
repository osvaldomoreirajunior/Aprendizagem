package com.example.finan.as;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Movimentacao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private boolean despesa;
    private double valor;
    private String titulo;
    private double totalfinancas;
    
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isDespesa() {
		return despesa;
	}
	public void setDespesa(boolean despesa) {
		this.despesa = despesa;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getTotalfinancas() {
		return totalfinancas;
	}
	public void setTotalfinancas(double totalfinancas) {
		this.totalfinancas = totalfinancas;
	}
	
	

}
