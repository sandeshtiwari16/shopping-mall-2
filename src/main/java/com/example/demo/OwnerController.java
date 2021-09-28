package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

 
@RestController
public class OwnerController {
 
    @Autowired
    private OwnerService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/owners")
    public List<Owner> list() {
        return service.listAll();
    }
    @GetMapping("/owners/{id}")
    public ResponseEntity<Owner> get(@PathVariable Integer id) {
        try {
        	Owner owner= service.get(id);
            return new ResponseEntity<Owner>(owner, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Owner>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Create operation
    @PostMapping("/owners")
    public void add(@RequestBody Owner owner) {
        service.save(owner);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/owners/{id}")
	public void update(@RequestBody Owner owner) {
		 service.update(owner);
	}
    // RESTful API method for Delete operation
    @DeleteMapping("/owners/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
   
}