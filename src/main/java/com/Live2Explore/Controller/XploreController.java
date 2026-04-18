package com.Live2Explore.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Live2Explore.DTO.ResetPasswordRequest;
import com.Live2Explore.Entity.Customer;
import com.Live2Explore.Service.XploreServiceInterface;

@CrossOrigin()
@RestController
@RequestMapping("/Live2Explore")

public class XploreController
{
@Autowired
	XploreServiceInterface service;
	
@PostMapping("/user/post")
public Customer save(@RequestBody Customer c1)
{
		return service.save(c1);
}

@GetMapping("/user/get")
public List<Customer> findAll()
{
	return service.findAll();
}


@PutMapping("/user/update/{uid}")
public String updateById(@PathVariable long uid, @RequestBody Customer c1)
{
	return service.updateById(uid,c1);
}

@DeleteMapping("/user/delete/{uid}")
public String delete(@PathVariable long uid) 
{
return service.delete(uid);
}

@PostMapping("/user/login")
public String userLogin(@RequestBody Customer customer) {

    return service.userLogin(
            customer.getUserName(),
            customer.getPassword()
    );    
}


@PatchMapping("/forget/password/{userName}")
public ResponseEntity<String> forgetPassword (@PathVariable String userName, @RequestBody ResetPasswordRequest request)
{
String response = service.forgetPassword(userName,request.getPassword());
		
		return ResponseEntity.ok(response);
	
}


}




 