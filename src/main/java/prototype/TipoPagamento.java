package prototype;

public class TipoPagamento implements Cloneable {
    private int id;
    private double conta;
    private double digitoConta;
    private double agencia;
    private String nomeBanco;
    private Pessoa pessoa;

    public TipoPagamento(int id, double conta, double digitoConta, double agencia, String nomeBanco, Pessoa pessoa) {
        this.id = id;
        this.conta = conta;
        this.digitoConta = digitoConta;
        this.agencia = agencia;
        this.nomeBanco = nomeBanco;
        this.pessoa = pessoa;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public double getConta() { return conta; }

    public void setConta(double conta) { this.conta = conta; }

    public double getDigitoConta() { return digitoConta; }

    public void setDigitoConta(double digitoConta) { this.digitoConta = digitoConta; }

    public double getAgencia() { return agencia; }

    public void setAgencia(double agencia) { this.agencia = agencia; }

    public String getNomeBanco() { return nomeBanco; }

    public void setNomeBanco(String nomeBanco) { this.nomeBanco = nomeBanco; }

    public Pessoa getPessoa() { return pessoa; }

    public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
    @Override
    public TipoPagamento clone() throws CloneNotSupportedException {
        TipoPagamento tipoPagamentoClone = (TipoPagamento) super.clone();
        tipoPagamentoClone.pessoa = (Pessoa) tipoPagamentoClone.pessoa.clone();
        return tipoPagamentoClone;
    }
    @Override
    public String toString() {
        return "TipoPagamento{" + "id = " + id +
                ", conta = " + conta +
                ", digitoConta = " + digitoConta +
                ", agencia = " + agencia +
                ", nomeBanco = " + nomeBanco  +
                ", pessoa = " + pessoa + '}';
    }
}
