package academia.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academia.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
