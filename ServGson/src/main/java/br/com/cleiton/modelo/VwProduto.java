package br.com.cleiton.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "vw_Produto")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "VwProduto.findAll", query = "SELECT v FROM VwProduto v"),
		@NamedQuery(name = "VwProduto.findByCodProduto", query = "SELECT v FROM VwProduto v WHERE v.codProduto = :codProduto"),
		@NamedQuery(name = "VwProduto.findByNome", query = "SELECT v FROM VwProduto v WHERE v.nome = :nome"),
		@NamedQuery(name = "VwProduto.findByPrecoVenda", query = "SELECT v FROM VwProduto v WHERE v.precoVenda = :precoVenda") })
public class VwProduto implements Serializable {
	public final static String VwProduto_findAll = "VwProduto.findAll";
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "CodProduto")
	private Integer codProduto;
	@Size(max = 100)
	@Column(name = "Nome")
	private String nome;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "PrecoVenda")
	private BigDecimal precoVenda;

	public VwProduto() {
	}

	public VwProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codProduto != null ? codProduto.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof VwProduto)) {
			return false;
		}
		VwProduto other = (VwProduto) object;
		if ((this.codProduto == null && other.codProduto != null)
				|| (this.codProduto != null && !this.codProduto
						.equals(other.codProduto))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "VwProduto [codProduto=" + codProduto + ", nome=" + nome
				+ ", precoVenda=" + precoVenda + "]";
	}

	

}
