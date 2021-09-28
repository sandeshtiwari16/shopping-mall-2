package com.example.demo;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class MallService {
 
    @Autowired
    private MallRepository repo;
     
    public List<Mall> listAll() {
        return repo.findAll();
    }
     
    public void save(Mall mall) {
        repo.save(mall);
    }
     
    public Mall get(Integer id) {
        return repo.findById(id).get();
    }
    
    public void update(Mall mall) { 	
		repo.save(mall);
	}
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
    
}