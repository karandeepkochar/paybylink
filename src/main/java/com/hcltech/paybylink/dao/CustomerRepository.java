package com.hcltech.paybylink.dao;

import com.hcltech.paybylink.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
