package factorymethod.model;

import factorymethod.factory.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoJurosTest {

    @Test
    void deveExecutarAcrescimoJuros() {
        IServico servico = ServicoFactory.obterServico("Juros");
        assertEquals("Acréscimo de juros efetuado!", servico.executar());
    }

    @Test
    void deveCancelarAcrescimoJuros() {
        IServico servico = ServicoFactory.obterServico("Juros");
        assertEquals("Acréscimo de juros cancelado!", servico.cancelar());
    }
}
