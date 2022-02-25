package com.github.antonioticelso.application.diodesafiopooII.model;

import lombok.Getter;

@Getter
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente.");
        imprimirInfoConmuns();
    }


}
