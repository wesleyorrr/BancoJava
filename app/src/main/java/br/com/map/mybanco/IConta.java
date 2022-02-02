package br.com.map.mybanco;

public interface IConta {
    void sacar( double valor);
    void depositar(double valor);
    void tranferir(double valor,Conta contadestinada);
    void imprimirExtrato();


}
