package com.example.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.customer.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>{

}
