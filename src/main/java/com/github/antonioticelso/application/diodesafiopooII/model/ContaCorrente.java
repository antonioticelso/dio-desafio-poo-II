package com.github.antonioticelso.application.diodesafiopooII.model;

import lombok.Getter;

@Getter
public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente.");
        imprimirInfoConmuns();
    }


}
