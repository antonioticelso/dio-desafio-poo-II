package com.github.antonioticelso.application.diodesafiopooII.model;


public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta poupança.");
        imprimirInfoConmuns();
    }


}
