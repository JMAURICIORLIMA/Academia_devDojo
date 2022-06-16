package academia.devdojo.maratonajava.javacore.Gassosiacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("#Jogo da previsão do futuro#");
        System.out.println("Digite sua pergunta e eu responderei se SIM ou NÃO.");
        String pergunta = scanner.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

    }
}
