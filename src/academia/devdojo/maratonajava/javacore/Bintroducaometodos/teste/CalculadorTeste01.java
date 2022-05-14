package academia.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academia.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadorTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando calculadoraTeste01");
        calculadora.subtraiDoisNumeros();
    }
}
