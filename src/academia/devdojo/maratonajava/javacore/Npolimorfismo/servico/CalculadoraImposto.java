package academia.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

/*
    6 - Criado um pacote para serviço e dentro do pacote uma classe CalculadoraImposto.
    Apenas para fornecer um relatório
    referente ao cálculo de imposto sobre os 2 produtos criados.
    Sendo 2 métodos - Para calcular o imposto do PRODUTO COMPUTADOR
    e outro calcular o imposto do PRODUTOO TOMATE.
 */
public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

}
