package org.example.Anonima;

public class TesteAnonima {
    public static void main(String[] args) {
        CarteiraContas carteira = new CarteiraContas();
        carteira.contaCorrente.imprimeTipoConta();
        carteira.contaPoupanca.imprimeTipoConta();
    }
}
