package com.stefanini.model;

import java.sql.Date;

public class Agente {
	private int idAgente;
	private String nome;
	private Date dtContratacao;
	private int tempoServico;
	
	public int getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtContratacao() {
		return dtContratacao;
	}
	public void setDtContratacao(Date dtContratacao) {
		this.dtContratacao = dtContratacao;
	}
	public int getTempoServico() {
		return tempoServico;
	}
	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
	}
}
