package com.dio.interfaces;

public interface IConta {
void sacar(Double valor);
void mostralExtrato();
void transferir(Double valor, IConta conta);
}
