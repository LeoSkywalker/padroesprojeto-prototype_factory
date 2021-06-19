package factorymethod.model;

import factorymethod.factory.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoCompraTest {

    @Test
    void deveExecutarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra autorizada!", servico.executar());
    }

    @Test
    void deveCancelarCompra() {
        IServico servico = ServicoFactory.obterServico("Compra");
        assertEquals("Compra não autorizada!", servico.cancelar());
    }
}
