package com.Live2Explore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Live2Explore.Entity.Bookigs;

@Repository
public interface BookigsRepository extends JpaRepository<Bookigs, Long> 
{

}