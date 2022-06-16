package academia.devdojo.maratonajava.javacore.Gassosiacao.teste;

import academia.devdojo.maratonajava.javacore.Gassosiacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafú");

//        Jogador[] jogadores = new Jogador[3];
//        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }
    }
}
