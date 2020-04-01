package br.unicesumar.cidade;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import br.unicesumar.rua.Rua;

@Entity
public class Cidade {
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String id;
	private String nome;
	private String sigla;

	public Cidade() {
		id = UUID.randomUUID().toString();
	}
	
	public Cidade(String nome, String sigla) {
		this.sigla = sigla;
		this.nome = nome;
	}
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
