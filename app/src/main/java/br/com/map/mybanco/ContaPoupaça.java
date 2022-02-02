package br.com.map.mybanco;

public class ContaPoupaça extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Poupança");
        System.out.println(String.format("Agencia: %d",super.agencia));
        System.out.println(String.format("Conta: %d",super.numero));
        System.out.println(String.format("Saldo: %.2f",super.saldo));
    }
}
