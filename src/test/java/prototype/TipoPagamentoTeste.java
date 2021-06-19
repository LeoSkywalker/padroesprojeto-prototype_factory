package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TipoPagamentoTeste {

    @Test
    void testClone() throws CloneNotSupportedException {
        TipoPagamento tipoPagamento = new TipoPagamento(1, 34567, 8, 825,
                "Banco do Brasil", new Pessoa("Leonardo dos Santos", "11158785534"));

        TipoPagamento tipoPagamentoClone = tipoPagamento.clone();
        tipoPagamentoClone.setId(2);
        tipoPagamentoClone.setNomeBanco("Banco Clonado");
        tipoPagamentoClone.getPessoa().setCpf("11177785433");

        assertEquals("TipoPagamento{id = 1, conta = 34567.0, digitoConta = 8.0, agencia = 825.0, " +
                "nomeBanco = Banco do Brasil, " + "pessoa = Pessoa{nome = Leonardo dos Santos, " +
                "cpf = 11158785534}}", tipoPagamento.toString());

        assertEquals("TipoPagamento{id = 2, conta = 34567.0, digitoConta = 8.0, agencia = 825.0, " +
                "nomeBanco = Banco Clonado, " + "pessoa = Pessoa{nome = Leonardo dos Santos, " +
                "cpf = 11177785433}}", tipoPagamentoClone.toString());
    }
}
