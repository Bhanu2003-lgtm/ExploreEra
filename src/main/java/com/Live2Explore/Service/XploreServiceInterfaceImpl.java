package com.Live2Explore.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Live2Explore.Entity.Customer;
import com.Live2Explore.Repository.XploreRepository;

@Service
public class XploreServiceInterfaceImpl implements XploreServiceInterface
{

	@Autowired
	XploreRepository repo;
	
	@Override
	public Customer save(Customer c1) {
		
		return repo.save(c1);
	}

	@Override
	public List<Customer> findAll() {
		
		return repo.findAll();
	}

	

	@Override
	public String updateById(long uid, Customer c1) {
		Optional<Customer> existing= repo.findById(uid);
		if(existing.isPresent())
		{
			Customer update = existing.get();
			update.setFullName(c1.getFullName());
			update.setMobileNo(c1.getMobileNo());
			update.setPassword(c1.getPassword());
			update.setUserName(c1.getUserName());
			return "Updated Successfully"+repo.save(update);
		}
		else
		{
			return"User Id not exist";
		}
	}

	@Override
	public String delete(long uid) 
	{
		if(repo.existsById(uid))
		{
			repo.deleteById(uid);
			return"Deleted Successfully"+uid;
		}
		else
		{
			return "User is not exist";
		}
		
	}

	@Override
	public String userLogin(String userName, String password) {
		
		Optional<Customer> exist=repo.findByUserNameAndPassword(userName,password);
		if(exist.isPresent())
		{
		return "user credentials matched";
		}
		else
		{
		return "user does not exist";
		}
	}
	@Override
	public String forgetPassword(String userName, String password)
	{
		Optional<Customer> exist = repo.findByUserName(userName);
		
		if(exist.isPresent())
		{
			Customer modify = exist.get();
			modify.setPassword(password);
			repo.save(modify);
			return "password modified successfully";
		}
		else
		{
			return "user does not exist";
		}
	}
	
}

