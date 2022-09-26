package com.example.customer.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.model.Customer;
import com.example.customer.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo repo;
	
	
	@Override
	public List<Customer> findallCustomerData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customer addCustomerData(Customer model) {
		// TODO Auto-generated method stub
		return repo.save(model);
	}
}

	


