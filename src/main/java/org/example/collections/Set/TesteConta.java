package org.example.collections.Set;

import java.util.HashSet;
import java.util.Set;

public class TesteConta {
    public static void main(String[] args) {
        Set<Conta> contas = new HashSet<>();
        contas.add(new Conta(100L,250.00));
        contas.add(new Conta(100L,300.00));

        contas.add(
                Conta.builder()
                        .saldo(250.90)
                        .numeroConta(101L)
                        .build()
        );

        contas.forEach( conta -> System.out.println(conta));
    }
}
