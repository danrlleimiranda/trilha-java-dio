package com.dio.design_patterns.repository;

import com.dio.design_patterns.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, String> {

}
