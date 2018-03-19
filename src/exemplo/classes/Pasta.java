package exemplo.classes;

import java.util.ArrayList;

public class Pasta extends Item {
	
	private ArrayList<Item> itens = new ArrayList<Item>(); 
	
	public Pasta(String nome) {
		this.nome = nome;
	}
	
	//Adicionar uma pasta ou arquivo
	public void adicionarItem(Item item) {
		this.itens.add(item);
		System.out.println("Item " + item.getNome() + " adicionado a pasta " + nome);
	}
	
	//Remover uma pasta ou arquivo
	public void removerItem(Item item) {
		this.itens.remove(item);
		System.out.println("Item " + item.getNome() + " removido da pasta " + nome);
	}
	
	//Listar o Itens da Pasta
	public void listarItens() {
		System.out.println("Itens na pasta " + nome + ":");
		for (Item item: itens) 
			System.out.println(item.getNome());
	}
}

