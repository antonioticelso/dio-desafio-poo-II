package com.github.antonioticelso.application.diodesafiopooII.model;

public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta ContaDestino);
    void imprimirExtrato();

}
