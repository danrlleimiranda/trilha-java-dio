package com.dio.gof.strategy;

public class AgressiveBehavior implements Behavior{

  @Override
  public void move() {
    System.out.println("Movendo-se agressivamente");
  }
}
