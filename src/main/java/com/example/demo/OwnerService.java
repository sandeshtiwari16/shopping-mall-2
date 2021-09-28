package com.example.demo;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class OwnerService {
 
    @Autowired
    private OwnerRepository repo4;
     
    public List<Owner> listAll() {
        return repo4.findAll();
    }
     
    public void save(Owner owner) {
        repo4.save(owner);
    }
     
    public Owner get(Integer id) {
        return repo4.findById(id).get();
    }
    
    public void update(Owner owner) { 	
		repo4.save(owner);
	}
     
    public void delete(Integer id) {
        repo4.deleteById(id);
    }
    
}