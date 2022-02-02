package br.com.map.mybanco;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 0;


    protected int agencia;
    protected int numero;
    protected double saldo;



    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void tranferir(double valor, Conta contadestinada) {
        this.sacar(valor);
        contadestinada.depositar(valor);

    }
}



