package exemplo.classes;

public class Pasta {

	public String nome;
	
	private ArrayList<???> itens = new ArrayList<???>(); 
	
	public Pasta(String nome) {
		this.nome = nome;
	}
	
	public String getNome() { return nome; }
	
	//Adicionar uma pasta ou arquivo
	public void adicionarItem(??? item) {
		this.itens.add(item);
		System.out.println("Item " + item.getNome() + " adicionado a pasta " + nome);
	}
	
	//Remover uma pasta ou arquivo
	public void removerItem(??? item) {
		this.itens.remove(item);
		System.out.println("Item " + item.getNome() + " removido da pasta " + nome);
	}
	
	//Listar o Itens da Pasta
	public void listarItens() {
		System.out.println("Itens na pasta " + nome + ":");
		for (??? item: itens) 
			System.out.println(item.getNome());
	}
}

