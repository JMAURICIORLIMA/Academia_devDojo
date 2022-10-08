package academia.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
        Regra da sobreescrita:
        1 - O nome precisa ser exatamente o mesmo.
        2 - Quantidade de parâmetros igual.
        3 - O tipo de retorno tem que ser a classe ou de alguma subclasse.
        4 - O modificador de acesso não pode ser mais restritivo.
     */
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
