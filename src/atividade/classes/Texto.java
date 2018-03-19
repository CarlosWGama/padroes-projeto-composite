package atividade.classes;

public class Texto extends InterfaceGrafica {

	public String texto = "";
	
	@Override
	public void adicionarElemento(InterfaceGrafica elemento) {
		return; //Não faz nada ao tentar adicionar componentes dentro um textos 
	}
	
	@Override
	public void exibirComponente() {
		System.out.println(texto);
	}
}
