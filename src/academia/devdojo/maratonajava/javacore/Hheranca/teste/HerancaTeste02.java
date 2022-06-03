package academia.devdojo.maratonajava.javacore.Hheranca.teste;

import academia.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

// 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai.
// 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha.
// 2 - Alocado espaço em memória para objeto da superclasse.
// 3 - Cada atributo da superclasse é criado e inicalizado com valores default ou o que for passado.
// 4 - Bloco de inicalização da superclasse é executado na ordem em que aparece.
// 5 - Construtor é executado da superclasse.
// 6 - Alocado espaço em memória para objeto da subclasse.
// 7 - Cada atributo da subclasse é criado e inicalizado com valores default ou o que for passado.
// 8 - Bloco de inicalização da subclasse é executado na ordem em que aparece.
// 9 - Construtor é executado da subclasse.

public class HerancaTeste02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
