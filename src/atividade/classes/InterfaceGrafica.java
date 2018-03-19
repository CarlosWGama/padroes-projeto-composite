package atividade.classes;

import java.util.ArrayList;

public abstract class InterfaceGrafica {

	protected ArrayList<InterfaceGrafica> componentes = new ArrayList<InterfaceGrafica>();
	
	public void adicionarElemento(InterfaceGrafica elemento) {
		componentes.add(elemento);
	}
	
	public void exibirComponente() {
		System.out.println("Exibe componentes de internos");
	}
}
