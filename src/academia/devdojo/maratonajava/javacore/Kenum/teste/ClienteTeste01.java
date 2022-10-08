package academia.devdojo.maratonajava.javacore.Kenum.teste;

import academia.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academia.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academia.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        System.out.println(tipoCliente1.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Jurídica");
        System.out.println(tipoCliente2);

        TipoCliente tipoCliente3 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente3);


    }
}
