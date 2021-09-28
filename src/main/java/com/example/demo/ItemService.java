package com.example.demo;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class ItemService {
 
    @Autowired
    private ItemRepository repo2;
     
    public List<Items> listAll() {
        return repo2.findAll();
    }
     
    public void save(Items item) {
        repo2.save(item);
    }
     
    public Items get(Integer id) {
        return repo2.findById(id).get();
    }
    
    public void update(Items item) { 	
		repo2.save(item);
	}
     
    public void delete(Integer id) {
        repo2.deleteById(id);
    }
    
}