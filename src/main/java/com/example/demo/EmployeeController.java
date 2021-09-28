package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

 
@RestController
public class EmployeeController {
 
    @Autowired
    private EmployeeService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/employees")
    public List<Employee> list() {
        return service.listAll();
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> get(@PathVariable Integer id) {
        try {
        	Employee employees = service.get(id);
            return new ResponseEntity<Employee>(employees, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Create operation
    @PostMapping("/employees")
    public void add(@RequestBody Employee employeee) {
        service.save(employeee);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/employees/{id}")
	public void update(@RequestBody Employee employeee) {
		 service.update(employeee);
	}
    // RESTful API method for Delete operation
    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
   
}