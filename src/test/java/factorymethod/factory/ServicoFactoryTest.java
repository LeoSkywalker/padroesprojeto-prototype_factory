package factorymethod.factory;

import factorymethod.model.IServico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ServicoFactoryTest {

    @Test
    void retornaExcecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.obterServico("Boleto");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente!", e.getMessage());
        }
    }

    @Test
    void retornaExcecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.obterServico("Notificacao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido!", e.getMessage());
        }
    }
}
