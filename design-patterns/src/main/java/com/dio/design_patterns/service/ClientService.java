package com.dio.design_patterns.service;

import com.dio.design_patterns.entity.Client;
import java.util.List;
import java.util.Optional;

public interface ClientService {
  Iterable<Client> findAll();
  Client findById(Long id);
  void insert(Client client);
  void update(Long id, Client cliente);
  void delete(Long id);
}
