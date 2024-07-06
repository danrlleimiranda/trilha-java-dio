package com.dio.gof.facade;

import com.dio.subsistema1.crm.CrmService;
import com.dio.subsistema2.cep.CepApi;

public class Facade {

  public void migrateClient(String name, String cep) {
    String city = CepApi.getInstance().getCity(cep);
    String state = CepApi.getInstance().getState(cep);
    CrmService.saveClient(name, cep, city, state);
  }
}
