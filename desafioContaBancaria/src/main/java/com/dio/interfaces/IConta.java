package com.dio.interfaces;

public interface IConta {
void sacar(Double valor);
void transferir(Double valor, IConta contaDestino);
void depositar(Double valor);
void imprimirExtrato();
}
