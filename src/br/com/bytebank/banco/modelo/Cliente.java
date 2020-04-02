package br.com.bytebank.banco.modelo;

/**
 * Classe que representa um cliente no Byebank
 * 
 * @author Bruna Moura
 * @version 0.1
 */

public class Cliente {
	
	private String nome;
	private String cpf;
	private String profisao;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfisao() {
		return profisao;
	}
	
	public void setProfisao(String profisao) {
		this.profisao = profisao;
	}
	

}
	