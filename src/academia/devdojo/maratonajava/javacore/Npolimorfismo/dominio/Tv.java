package academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tv extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Tv(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto da Televisão");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
