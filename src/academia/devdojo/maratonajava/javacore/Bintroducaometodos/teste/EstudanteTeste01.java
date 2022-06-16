package academia.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academia.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academia.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Benjamin";
        estudante01.idade = 6;
        estudante01.sexo = 'M';

        estudante02.nome = "Ellen";
        estudante02.idade = 4;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);

        System.out.println("------------------------------");

        impressora.imprime(estudante02);
    }
}
