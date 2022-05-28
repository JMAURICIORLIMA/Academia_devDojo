package academia.devdojo.maratonajava.javacore.Hheranca.teste;

import academia.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academia.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academia.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12315-099");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("123123123-00");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("***************************");

        Funcionario funcionario = new Funcionario("José Augusto");
        funcionario.setCpf("456456456-88");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);
        funcionario.imprime();

    }
}
