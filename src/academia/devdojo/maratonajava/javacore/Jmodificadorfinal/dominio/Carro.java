package academia.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();
    /*
        Toda constante em Java deve está com sua descrição
        em CAIXA ALTA e sepadado por _ para mais de uma palavra.
     */
    public static final double VELOCIDADE_LIMITE = 250;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
