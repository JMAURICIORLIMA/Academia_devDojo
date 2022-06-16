package academia.devdojo.maratonajava.javacore.Fmodificadorestatico.teste;

import academia.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.CarroMetodoStatic;

public class CarroTeste01MetodoStatic {
    public static void main(String[] args) {
        // Está alterando o valor de todos os objetos instaciados a partir da classe Carro.
        CarroMetodoStatic.setVelocidadeLimite(180);

        CarroMetodoStatic c1 = new CarroMetodoStatic("BMW", 280);
        CarroMetodoStatic c2 = new CarroMetodoStatic("Mercedes", 275);
        CarroMetodoStatic c3 = new CarroMetodoStatic("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
