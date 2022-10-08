package academia.devdojo.maratonajava.javacore.Gassosiacao.exercicio.teste;

import academia.devdojo.maratonajava.javacore.Gassosiacao.exercicio.dominio.Aluno;
import academia.devdojo.maratonajava.javacore.Gassosiacao.exercicio.dominio.Local;
import academia.devdojo.maratonajava.javacore.Gassosiacao.exercicio.dominio.Professor;
import academia.devdojo.maratonajava.javacore.Gassosiacao.exercicio.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local1 = new Local("Rua das Laranjeiras");
        Aluno aluno1 = new Aluno("José", 22);
        Professor professor1 = new Professor("Ricardo de Oliveira", "Tecnologia da informação");
        Aluno[] alunosParaSeminario = {aluno1};

        Seminario seminario1 = new Seminario("Tecnologia", alunosParaSeminario, local1);

        Seminario[] seminariosDisponiveis = {seminario1};

        professor1.setSeminarios(seminariosDisponiveis);

        professor1.imprime();


    }
}
