package academia.devdojo.maratonajava.javacore.Eblocosinicializacao.teste;

import academia.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
