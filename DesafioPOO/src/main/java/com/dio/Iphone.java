package com.dio;

import com.dio.interfaces.AparelhoTelefonicoInterface;
import com.dio.interfaces.NavegadorInternetInterface;
import com.dio.interfaces.ReprodutorMusicalInterface;

public class Iphone implements AparelhoTelefonicoInterface, ReprodutorMusicalInterface,
    NavegadorInternetInterface {

public Iphone(){}


  @Override
  public void tocar() {
    System.out.println("Música tocando...");
  }

  @Override
  public void pausar() {
    System.out.println("Música pausada...");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Música selecionada...");
  }

  @Override
  public void ligar() {
    System.out.println("Ligando...");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo...");
  }

  @Override
  public void iniciarCorrerioVoz() {
    System.out.println("Correio de voz iniciado, grave sua mensagem...");
  }

  @Override
  public void exibirPagina() {
    System.out.println("Página sendo exibida...");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Nova aba adicionada...");
  }

  @Override
  public void atualizarPagina() {
  System.out.println("Página atualizada!");
  }
}
