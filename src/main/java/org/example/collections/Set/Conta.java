package org.example.collections.Set;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder

public class Conta {

    private Long numeroConta;
    private Double saldo;
    @Override
    public int hashCode() {
        return numeroConta.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Conta conta = (Conta) obj;
        return this.numeroConta.equals(conta.getNumeroConta());
    }
}
