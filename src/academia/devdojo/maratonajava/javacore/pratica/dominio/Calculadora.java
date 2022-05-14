package academia.devdojo.maratonajava.javacore.pratica.dominio;

import java.util.Scanner;

public class Calculadora {

    static Scanner scanner = new Scanner(System.in);

    public double[] entradaDados() {
        double[] valores = new double[2];
        System.out.print("Digite o primeiro número: ");
        valores[0] = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        valores[1] = scanner.nextDouble();
        return valores;
    }

    public void menu() {
        System.out.println("Selecione uma das opções abaixo." +
                "\n 1 - soma" +
                "\n 2 - subtração" +
                "\n 3 - divisão" +
                "\n 4 - multiplicação" +
                "\n 0 - sair");

        int selecaoMenu = scanner.nextInt();

        do {

            switch (selecaoMenu) {

                case 1:
                    soma(entradaDados());
                    break;

                case 2:
                    subtracao(entradaDados());
                    break;

                case 3:
                    divisao(entradaDados());
                    break;

                case 4:
                    multiplicacao(entradaDados());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção não atendida.");
            }

            System.out.println("Selecione uma das opções abaixo." +
                    "\n 1 - soma" +
                    "\n 2 - subtração" +
                    "\n 3 - divisão" +
                    "\n 4 - multiplicação" +
                    "\n 0 - sair");

            selecaoMenu = scanner.nextInt();

        } while (selecaoMenu != 0);
    }

    public void soma(double... valores) {
        System.out.println("A soma entre: " + valores[0] + " e " + valores[1] +
                "\nResultado = " + (valores[0] + valores[1]));
    }

    public void subtracao(double... valores) {
        System.out.println("A subtração entre: " + valores[0] + " e " + valores[1] +
                "\nResultado = " + (valores[0] - valores[1]));
    }

    public void divisao(double... valores) {
        if (valores[1] == 0) {
            System.out.println("ERRO! Não existe divisão por zero.");
            return;
        }
        System.out.println("A divisão entre: " + valores[0] + " e " + valores[1] +
                "\nResultado = " + (valores[0] / valores[1]));
    }

    public void multiplicacao(double... valores) {
        System.out.println("A multiplicação entre: " + valores[0] + " e " + valores[1] +
                "\nResultado = " + (valores[0] * valores[1]));
    }
}
