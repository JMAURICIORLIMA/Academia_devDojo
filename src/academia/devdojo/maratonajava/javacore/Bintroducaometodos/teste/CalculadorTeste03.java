package academia.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academia.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadorTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.divideDoisNumeros(20, 2);
        System.out.println(calculadora.divideDoisNumeros(20, 2));

        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros02(20,0));

        System.out.println(calculadora.divideDoisNumeros03(20,0));

        calculadora.imprimeDivisaoDeDoisNumeros(10, 0);
        calculadora.imprimeDivisaoDeDoisNumeros(20, 4);

        calculadora.imprimeDivisaoDeDoisNumeros02(10, 0);
        calculadora.imprimeDivisaoDeDoisNumeros02(20, 4);

        // Método com erro por falta de tratamento.
        calculadora.imprimeDivisaoDeDoisNumeros03(20, 0);
    }
}
