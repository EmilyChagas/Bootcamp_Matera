package org.example.Abstrata;

public class ContaPoupanca extends Conta {
    @Override // Sobreescrever na herança da conta
    public void imprimirExtrato(){
        System.out.println("Extrato da Conta Poupanca");
    }
}
