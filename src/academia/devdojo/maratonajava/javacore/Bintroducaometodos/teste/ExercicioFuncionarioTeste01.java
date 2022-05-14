package academia.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academia.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ExercicioFuncionario;

public class ExercicioFuncionarioTeste01 {
    public static void main(String[] args) {
        ExercicioFuncionario funcionario = new ExercicioFuncionario();
        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987.32, 2000};

        funcionario.imprime();
    }
}
