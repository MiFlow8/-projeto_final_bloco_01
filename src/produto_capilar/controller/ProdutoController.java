package produto_capilar.controller;

import java.util.ArrayList;
import java.util.List;

import produto_capilar.model.ProdutoCapilar;

public class ProdutoController {
	
	private List<ProdutoCapilar> produtos = new ArrayList<>();

    
    public void cadastrar(ProdutoCapilar produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    
    public void listar() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (ProdutoCapilar p : produtos) {
                System.out.println(p.getNome());
            }
        }
    }

    
    public ProdutoCapilar buscar(int id) {
        try {
            for (ProdutoCapilar p : produtos) {
                if (p.getId() == id) {
                    return p;
                }
            }
            throw new RuntimeException("Produto não encontrado!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    
    public void atualizar(ProdutoCapilar produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == produto.getId()) {
                produtos.set(i, produto);
                System.out.println("Produto atualizado!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    
    public void deletar(int id) {
        produtos.removeIf(p -> p.getId() == id);
        System.out.println("Produto removido!");
    }

}
