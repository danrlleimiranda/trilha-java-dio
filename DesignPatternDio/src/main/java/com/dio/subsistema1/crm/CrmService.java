package com.dio.subsistema1.crm;

public class CrmService {

  private CrmService() {
    super();
  }
  public static void saveClient(String name, String cep, String state, String city) {
    System.out.printf("Cliente %s com CEP %s salvo no sistema de CRM%n", name, cep);
  }
}
