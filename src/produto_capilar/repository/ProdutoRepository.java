package produto_capilar.repository;

import produto_capilar.model.ProdutoCapilar;

public interface ProdutoRepository {
	
	void cadastrarProduto(ProdutoCapilar produto);

    void listarProdutos();

    ProdutoCapilar buscarPorId(int id);

    void atualizarProduto(ProdutoCapilar produto);

    void deletarProduto(int id);
	
}
