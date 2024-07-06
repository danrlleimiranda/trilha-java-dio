package com.dio.gof.singleton;

public class SingletonLazyHolder {

  private static class Holder {
    public static SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
  }

  private SingletonLazyHolder(){
    super();
  }

  public static SingletonLazyHolder getInstance() {
    return Holder.INSTANCE;
  }
}
