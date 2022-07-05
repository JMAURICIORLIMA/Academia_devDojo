package academia.devdojo.maratonajava.javacore.Npolimorfismo.Teste;

import academia.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);

    }
}
