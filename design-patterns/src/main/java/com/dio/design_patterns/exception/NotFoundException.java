package com.dio.design_patterns.exception;

public class NotFoundException extends RuntimeException{

  public NotFoundException(String message) {
    super(message);
  }
}
