package academia.devdojo.maratonajava.javacore.Npolimorfismo.Teste;

import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tv;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto02;

public class ProdutoTeste03 {
    public static void main(String[] args) {

        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Tv tv = new Tv("LG 50\"", 4900);

        CalculadoraImposto02.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto02.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto02.calcularImposto(tv);
    }
}
