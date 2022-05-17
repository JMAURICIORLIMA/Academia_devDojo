package academia.devdojo.maratonajava.javacore.Dconstrutores.teste;

import academia.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();

    }
}
