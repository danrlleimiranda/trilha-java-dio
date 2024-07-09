package com.dio.design_patterns.service.impl;

import com.dio.design_patterns.entity.Address;
import com.dio.design_patterns.entity.Client;
import com.dio.design_patterns.exception.ClientNotFoundException;
import com.dio.design_patterns.repository.AddressRepository;
import com.dio.design_patterns.repository.ClientRepository;
import com.dio.design_patterns.service.ClientService;
import com.dio.design_patterns.service.ViaCepService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

  private ClientRepository clientRepository;
  private AddressRepository addressRepository;
  private ViaCepService viaCepService;

  @Autowired
  public ClientServiceImpl(ClientRepository clientRepository, AddressRepository addressRepository,
      ViaCepService viaCepService) {
    this.clientRepository = clientRepository;
    this.addressRepository = addressRepository;
    this.viaCepService = viaCepService;
  }

  @Override
  public Iterable<Client> findAll() {
    return clientRepository.findAll();
  }

  @Override
  public Client findById(Long id) {
    return clientRepository.findById(id).orElseThrow(ClientNotFoundException::new);
  }

  @Override
  public void insert(Client client) {
    saveClientWithCep(client);
  }

  @Override
  public void update(Long id, Client client) {

    Optional<Client> cliente = clientRepository.findById(id);

    if (cliente.isPresent()) {
      saveClientWithCep(client);
    }
  }

  @Override
  public void delete(Long id) {
    clientRepository.deleteById(id);
  }

  private void saveClientWithCep(Client client) {
    String cep = client.getAddress().getCep();
    Address address = addressRepository.findById(cep).orElseGet(() -> {
      Address newAddress = viaCepService.consultarCep(cep);
      addressRepository.save(newAddress);
      return newAddress;
    });
    client.setAddress(address);
    clientRepository.save(client);
  }
}
