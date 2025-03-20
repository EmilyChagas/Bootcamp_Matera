package org.example.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class TesteMapNumeros {
    public static void main(String[] args) {
        Map<String, Integer> contas = new HashMap<>();

        contas.put("Conta Corrente", 1);
        contas.put("Conta Pagamento", 2);
        contas.put("Conta Poupanca", 3);
        contas.put("Conta Corrente", 4);

        System.out.println(contas);
        System.out.println(contas.get("Conta Corrente"));

        System.out.println(contas.keySet());
    }
}
