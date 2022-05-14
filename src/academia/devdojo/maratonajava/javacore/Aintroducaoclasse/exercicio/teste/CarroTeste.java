package academia.devdojo.maratonajava.javacore.Aintroducaoclasse.exercicio.teste;

import academia.devdojo.maratonajava.javacore.Aintroducaoclasse.exercicio.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca";
        carro1.modelo = "Conforf";
        carro1.ano = 1990;

        carro2.nome = "BMW";
        carro2.modelo = "M2";
        carro2.ano = 2020;

        System.out.println("Nome: " + carro1.nome +
                "\nModelo: " + carro1.modelo +
                "\nAno: " + carro1.ano);

        System.out.println("----------------------");

        System.out.println("Nome: " + carro2.nome +
                "\nModelo: " + carro2.modelo +
                "\nAno: " + carro2.ano);


    }
}
