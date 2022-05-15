package academia.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

/*
 Acoplamento
 Aula 54 - Orientação Objetos - Modificador de acesso private, get e set pt 01
 */

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

}
