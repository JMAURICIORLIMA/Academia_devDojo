package academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

/*
    1- Esta classe Produto foi criada como abstrata com o intúito de ser apenas extendida
    Onde classes concretas terão sua procedência Extendendo desta classe.
 */

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
