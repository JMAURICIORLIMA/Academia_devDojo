package academia.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academia.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academia.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Zoro", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);

    }
}
