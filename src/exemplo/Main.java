package exemplo;

import exemplo.classes.Pasta;

public class Main {

	public static void main(String[] args) {

		Pasta pasta = new Pasta("C");
		pasta.adicionarItem(new Pasta("usuarios"));
		pasta.adicionarItem(new Arquivo("log.txt"));

	}

}
