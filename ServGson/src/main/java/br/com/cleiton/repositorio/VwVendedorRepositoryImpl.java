package br.com.cleiton.repositorio;

import java.util.List;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.cleiton.modelo.VwProduto;

@Component
public class VwVendedorRepositoryImpl {
	protected final Session session;

	public VwVendedorRepositoryImpl(Session session) {
		super();
		this.session = session;
	}

	public List<VwProduto> listAll() {
		return session.getNamedQuery(VwProduto.VwProduto_findAll).list();
	}

}
