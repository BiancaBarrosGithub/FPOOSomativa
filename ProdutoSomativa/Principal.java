package ProdutoSomativa;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro ("É assim que começa", "Collen Houver", 345);
		
		System.out.println("Nome: " + livro.getNome());
		System.out.println("Autor: " + livro.getAutor());
		System.out.println("Paginas: " + livro.getPaginas());
	}
}
