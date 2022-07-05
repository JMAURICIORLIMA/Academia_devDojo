package academia.devdojo.maratonajava.javacore.Npolimorfismo.Teste;

import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto02;

public class ProdutoTeste04 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 7", 6000);

        System.out.println("----------------------");

        Tomate tomate = new Tomate("Tamate organico", 15);
        tomate.setDataValidade("25/07/2022");

        CalculadoraImposto02.calcularImposto(tomate);
        System.out.println("----------------------");
        CalculadoraImposto02.calcularImposto(produto1);


    }
}
