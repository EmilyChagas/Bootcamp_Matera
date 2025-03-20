package org.example.Modificador;

public class ContaCorrente {

    public static void main(String[] args) {
        Conta conta = new Conta(20.00);

        conta.setSaldo(10.00);
        conta.getSaldo();

    }

}
