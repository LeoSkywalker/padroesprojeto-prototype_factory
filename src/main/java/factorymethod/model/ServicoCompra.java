package factorymethod.model;

public class ServicoCompra implements IServico{

    public String executar() { return "Compra autorizada!"; }

    public String cancelar() { return "Compra não autorizada!"; }
}
