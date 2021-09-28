package com.example.demo;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class ShopService {
 
    @Autowired
    private ShopRepository repo5;
     
    public List<Shop> listAll() {
        return repo5.findAll();
    }
     
    public void save(Shop shop) {
        repo5.save(shop);
    }
     
    public Shop  get(Integer id) {
        return repo5.findById(id).get();
    }
    
    public void update(Shop shop) { 	
		repo5.save(shop);
	}
     
    public void delete(Integer id) {
        repo5.deleteById(id);
    }
    
}