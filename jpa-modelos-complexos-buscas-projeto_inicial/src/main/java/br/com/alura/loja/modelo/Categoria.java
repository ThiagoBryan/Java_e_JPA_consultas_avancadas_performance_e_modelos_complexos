package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {

	@EmbeddedId
	private CategoriaId id;

	public Categoria() {
	}

	public Categoria(String nome) {
		this.id = new CategoriaId(nome, "qualquerAtributo");
	}

	public String nome(){
		return this.id.getNome();
	}



}
