package br.com.cleiton.controllador;

import java.util.List;

import com.google.gson.Gson;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.cleiton.modelo.VwProduto;
import br.com.cleiton.repositorio.VwProdutoRepositoryImpl;

@Resource
public class ProdutoController {
	private final Result result;
	private final VwProdutoRepositoryImpl repository;

	public ProdutoController(Result result, VwProdutoRepositoryImpl repository) {
		super();
		this.result = result;
		this.repository = repository;
	}

	@Get("/produtos")
	public void listAll() {
		List<VwProduto> listAll = repository.listAll();
		Gson gson = new Gson();
		String json = gson.toJson(listAll);
		result.use(Results.http()).body(json);
	}

}