package com.operation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.operation.Model.lists;

public interface listsRepo extends JpaRepository<lists, Integer> {

	Boolean existsByfirstname(String firstname);
	
	List<lists> findByfirstname(String firstname);
}
