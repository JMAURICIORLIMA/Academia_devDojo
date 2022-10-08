package academia.devdojo.maratonajava.javacore.Npolimorfismo.Teste;

import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 7", 6000);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());

        System.out.println("----------------------");

        Produto produto2 = new Tomate("Tamate organico", 15);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

    }
}
