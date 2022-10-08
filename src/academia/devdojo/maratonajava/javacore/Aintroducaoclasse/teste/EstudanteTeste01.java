package academia.devdojo.maratonajava.javacore.Aintroducaoclasse.teste;

import academia.devdojo.maratonajava.javacore.Aintroducaoclasse.dominio.Estudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Benjamin";
        estudante.idade = 6;
        estudante.sexo = 'M';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("Endereço da variável de referência: " + estudante);

    }
}
