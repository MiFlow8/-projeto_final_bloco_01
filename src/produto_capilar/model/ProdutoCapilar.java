package produto_capilar.model;

public abstract class ProdutoCapilar {
	
	private int id;
	private String nome;
	private double preco;
	private String marca;
	
	public ProdutoCapilar(int id, String nome, double preco, String marca) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


}
