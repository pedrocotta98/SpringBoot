package com.example.demo.domain;

import java.util.*;

import javax.persistence.*;
@SuppressWarnings("serial")
@Entity
@Table(name ="DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {
	@Column(name="nome", nullable=false,unique =true,length =60)
	private String nome;
	
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargos;
	
	public String getNome() {
		return nome;
	}

	public List<Cargo> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargo> cargos) {
		this.cargos = cargos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
