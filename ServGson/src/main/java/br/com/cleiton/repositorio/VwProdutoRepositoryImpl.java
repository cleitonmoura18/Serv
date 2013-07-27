package br.com.cleiton.repositorio;

import java.util.List;

import org.hibernate.Session;

import br.com.caelum.vraptor.ioc.Component;
import br.com.cleiton.modelo.VwProduto;
import br.com.cleiton.modelo.VwVendedor;

@Component
public class VwProdutoRepositoryImpl {
	protected final Session session;

	public VwProdutoRepositoryImpl(Session session) {
		super();
		this.session = session;
	}

	public List<VwProduto> listAll() {
		return session.getNamedQuery(VwProduto.VwProduto_findAll).list();
	}

}
