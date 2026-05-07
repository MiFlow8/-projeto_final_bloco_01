package produto_capilar.model;

public class Progressiva extends ProdutoCapilar {
	
	private String tipoAlisamento;

	public Progressiva(int id, String nome, double preco, String marca, String tipoAlisamento) {
        super(id, nome, preco, marca);
        this.tipoAlisamento = tipoAlisamento;
    }

    public String getTipoAlisamento() {
        return tipoAlisamento;
    }

    public void setTipoAlisamento(String tipoAlisamento) {
        this.tipoAlisamento = tipoAlisamento;
    }
}
