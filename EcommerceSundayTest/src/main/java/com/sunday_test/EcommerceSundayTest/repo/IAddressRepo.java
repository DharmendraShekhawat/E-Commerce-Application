package com.sunday_test.EcommerceSundayTest.repo;

import com.sunday_test.EcommerceSundayTest.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Integer> {

}
