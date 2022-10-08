package academia.devdojo.maratonajava.javacore.Bintroducaometodos.exercicio.dominio;

import java.util.Scanner;

public class EntradaDados {

    Scanner scanner = new Scanner(System.in);

    public void dados(Funcionarios funcionarios) {
        System.out.println("### Bem vindo(a), por favor insira os dados ###");
        System.out.print("Nome: ");
        funcionarios.nome = scanner.nextLine();
        System.out.print("Idade: ");
        funcionarios.idade = scanner.nextInt();
        System.out.print("Insira os 3 últimos salários: ");
        double somaGanhos = 0;

        if (funcionarios.salarios.length != 0) {
            for (int i = 0; i < funcionarios.salarios.length; i++) {
                System.out.print("Informe o " + (i + 1) + "º salário: ");
                funcionarios.salarios[i] = scanner.nextDouble();
                somaGanhos += funcionarios.salarios[i];
            }
            System.out.println("\n A média dos 3 últimos salários é de R$: " + somaGanhos / funcionarios.salarios.length);
        }
    }

}
