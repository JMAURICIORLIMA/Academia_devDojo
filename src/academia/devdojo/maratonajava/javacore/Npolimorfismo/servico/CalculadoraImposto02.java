package academia.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto02 {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }

    }

}
