package com.dio.gof.singleton;

public class SingletonLazy {

  private static SingletonLazy INSTANCE;

  private SingletonLazy(){
    super();
  }

  public static SingletonLazy getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new SingletonLazy();
    }
    return INSTANCE;
  }
}
