package academia.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class AnimeBlocoInicializacaoEstatica {
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe.
    // 1 - Alocado espaço em memória para objeto.
    // 2 - Cada atributo de classe é criado e inicalizado com valores default ou o que for passado.
    // 3 - Bloco de inicalização é executado.
    // 4 - Construtor é executado.
    static {
        System.out.println("Dentro do bloco de inicialização estático - 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático - 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático - 3");
    }

    private String nome;

    {
        System.out.println("Dentro do bloco de incialização não estático.");
    }

    public AnimeBlocoInicializacaoEstatica(String nome) {
        this.nome = nome;
    }

    public AnimeBlocoInicializacaoEstatica() {
        for (int episodio : AnimeBlocoInicializacaoEstatica.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}