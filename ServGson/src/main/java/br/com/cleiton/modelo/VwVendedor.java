/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cleiton.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Cleiton
 */
@Entity
@Table(name = "vw_Vendedor")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "VwVendedor.findAll", query = "SELECT v FROM VwVendedor v"),
		@NamedQuery(name = "VwVendedor.findByCodFuncionario", query = "SELECT v FROM VwVendedor v WHERE v.codFuncionario = :codFuncionario"),
		@NamedQuery(name = "VwVendedor.findByNomeVendedor", query = "SELECT v FROM VwVendedor v WHERE v.nomeVendedor = :nomeVendedor") })
public class VwVendedor implements Serializable {
	public static final String VwVendedor_findAll = "VwVendedor.findAll";
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "CodFuncionario")
	private Integer codFuncionario;
	@Size(max = 100)
	@Column(name = "NomeVendedor")
	private String nomeVendedor;

	public VwVendedor() {
	}

	public VwVendedor(Integer codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public Integer getCodFuncionario() {
		return codFuncionario;
	}

	public void setCodFuncionario(Integer codFuncionario) {
		this.codFuncionario = codFuncionario;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codFuncionario != null ? codFuncionario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof VwVendedor)) {
			return false;
		}
		VwVendedor other = (VwVendedor) object;
		if ((this.codFuncionario == null && other.codFuncionario != null)
				|| (this.codFuncionario != null && !this.codFuncionario
						.equals(other.codFuncionario))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "VwVendedor [codFuncionario=" + codFuncionario
				+ ", nomeVendedor=" + nomeVendedor + "]";
	}

	
}
