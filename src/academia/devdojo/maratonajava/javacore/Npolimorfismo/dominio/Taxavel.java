package academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

/*
    4 - Esta interface foi criada para promover um contrato de que os PRODUTOS concretos
    Deverão ter um calculo de Imposto sobre o mesmo.

    5 - Portanto fia a critério da primeira classe concretas prover a implementação.
    Computador e Tomate deverão realizar a sobrescrita do método abaixo
    Cada um com uma definição diferente relacionada ao Imposta da própria classe.
 */

public interface Taxavel {
    public abstract double calcularImposto();
}
