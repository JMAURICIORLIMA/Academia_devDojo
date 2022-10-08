package academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

/*
    2 - Esta classe irá usar como definido o contrutor da classe Produto
 */

public class Computador extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do Computador");
        return this.valor * IMPOSTO_POR_CENTO;
    }

}
