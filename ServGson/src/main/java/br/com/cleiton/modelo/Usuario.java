package br.com.cleiton.modelo;

@javax.persistence.Entity
public class Usuario extends Entity {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
