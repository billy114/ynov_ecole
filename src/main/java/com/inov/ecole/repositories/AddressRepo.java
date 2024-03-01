package com.inov.ecole.repositories;

import com.inov.ecole.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddressRepo extends JpaRepository<Address, Long> {
    Address save (Address address);
}
