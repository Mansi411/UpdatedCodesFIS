package com.example.customer.service;
import java.util.List;

import com.example.customer.model.Customer;

public interface CustomerService {

		public List<Customer> findallCustomerData();
		public Customer addCustomerData(Customer model);
		//public String deleteMovieData(int movie_id);
	}

