package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// inject CustomerDAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		List<Customer> customers = this.customerDAO.getCustomers();
		
		return customers;
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		this.customerDAO.saveCustomer(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		Customer customer = this.customerDAO.getCustomer(id);
		
		return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		this.customerDAO.deleteCustomer(id);
	}

}
