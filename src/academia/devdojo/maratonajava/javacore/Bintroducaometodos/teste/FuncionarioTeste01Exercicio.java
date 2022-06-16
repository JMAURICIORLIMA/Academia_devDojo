package academia.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academia.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioExercicio;

public class FuncionarioTeste01Exercicio {
    public static void main(String[] args) {
        FuncionarioExercicio funcionario = new FuncionarioExercicio();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
