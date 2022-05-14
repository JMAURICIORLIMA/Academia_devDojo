package academia.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academia.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        System.out.println("-----------------------");
        calculadora.varArgs(1,2,3,4,5,6,7,8);
    }
}
