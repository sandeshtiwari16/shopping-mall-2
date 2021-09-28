package com.example.demo;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class EmployeeService {
 
    @Autowired
    private EmployeeRepository repo1;
     
    public List<Employee> listAll() {
        return repo1.findAll();
    }
     
    public void save(Employee employeee) {
        repo1.save(employeee);
    }
     
    public Employee get(Integer id) {
        return repo1.findById(id).get();
    }
    
    public void update(Employee employeee) { 	
		repo1.save(employeee);
	}
     
    public void delete(Integer id) {
        repo1.deleteById(id);
    }
    
}