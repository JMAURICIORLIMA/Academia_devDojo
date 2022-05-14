package academia.devdojo.maratonajava.javacore.Aintroducaoclasse.teste;

import academia.devdojo.maratonajava.javacore.Aintroducaoclasse.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "Bernardo";
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);

        System.out.println("--------------------");

        System.out.println("Nome: " + estudante2.nome);
        System.out.println("Idade: " + estudante2.idade);
        System.out.println("Sexo: " + estudante2.sexo);

        System.out.println("Como o valor de IDADE e SEXO não foram definidos, serão inseridos os valores default (Padão).");

    }
}
