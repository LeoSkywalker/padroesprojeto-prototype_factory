package factorymethod.model;

import factorymethod.factory.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicoMultaTest {

    @Test
    void deveExecutarAcrescimoMulta() {
        IServico servico = ServicoFactory.obterServico("Multa");
        assertEquals("Multa por atraso de pagamento acrescida!", servico.executar());
    }

    @Test
    void deveCancelarAcrescimoMulta() {
        IServico servico = ServicoFactory.obterServico("Multa");
        assertEquals("Multa por atraso de pagamento cancelada!", servico.cancelar());
    }
}
