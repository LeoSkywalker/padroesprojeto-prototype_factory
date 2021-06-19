package factorymethod.model;

public class ServicoJuros implements IServico{

    public String executar() { return "Acréscimo de juros efetuado!"; }

    public String cancelar() { return "Acréscimo de juros cancelado!"; }
}
