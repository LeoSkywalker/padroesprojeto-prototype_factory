package factorymethod.model;

public class ServicoMulta implements IServico{

    public String executar() { return "Multa por atraso de pagamento acrescida!"; }

    public String cancelar() { return "Multa por atraso de pagamento cancelada!"; }
}
