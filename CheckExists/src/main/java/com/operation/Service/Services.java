package com.operation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operation.Model.lists;
import com.operation.Repository.listsRepo;

@Service
public class Services {
	
	@Autowired 
	private listsRepo repo;
	
	public lists adduser(lists list) {
		return repo.save(list);
		
	}

}
