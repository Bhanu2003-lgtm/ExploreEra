package com.Live2Explore.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Live2Explore.Entity.Customer;


@Repository
public interface XploreRepository extends JpaRepository<Customer, Long> 
{

	Optional<Customer> findByUserNameAndPassword(String userName, String password);

	Optional<Customer> findByUserName(String userName);

}
