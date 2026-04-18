package com.Live2Explore.Service;

import java.util.List;

import com.Live2Explore.Entity.Customer;

public interface XploreServiceInterface
{

	Customer save(Customer c1);

	List<Customer> findAll();

	String updateById(long uid,Customer c1);

	String delete(long uid);

	String userLogin(String userName, String password);

	String forgetPassword(String userName, String password);

}
