package com.dio.subsistema2.cep;

import com.dio.gof.singleton.SingletonEager;

public class CepApi {
  private static final CepApi INSTANCE = new CepApi();

  private CepApi() {
    super();
  }

  public static CepApi getInstance() {
    return INSTANCE;
  }

  public String getCity(String cep) {
    return "São Paulo";
  }

  public String getState(String cep) {
    return "SP";
  }

}
