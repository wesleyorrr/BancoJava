package br.com.map.mybanco;

public class ContaCorrente extends Conta {
    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato cc corente");

        System.out.println(String.format("Agencia: %d",super.agencia));
        System.out.println(String.format("Conta: %d",super.numero));
        System.out.println(String.format("Saldo: %.2f",super.saldo));

    }

}

