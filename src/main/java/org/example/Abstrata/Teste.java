package org.example.Abstrata;

public class Teste {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        cp.imprimirExtrato();
        cc.imprimirExtrato();
    }
}
