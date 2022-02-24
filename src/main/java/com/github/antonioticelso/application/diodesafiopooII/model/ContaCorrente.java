package com.github.antonioticelso.application.diodesafiopooII.model;

import lombok.Data;

@Data
public class ContaCorrente {

    private int agencia;
    private int numero;
    private double saldo;

    public void sacar() {}
    public void depositar() {}
    public void transferir() {}

}
