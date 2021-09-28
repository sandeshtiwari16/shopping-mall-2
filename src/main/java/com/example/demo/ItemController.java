package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

 
@RestController
public class ItemController {
 
    @Autowired
    private ItemService service;
     
    // RESTful API methods for Retrieval operations
    @GetMapping("/items")
    public List<Items> list() {
        return service.listAll();
    }
    @GetMapping("/items/{id}")
    public ResponseEntity<Items> get(@PathVariable Integer id) {
        try {
        	Items item = service.get(id);
            return new ResponseEntity<Items>(item, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
        }      
    }
    // RESTful API method for Create operation
    @PostMapping("/items")
    public void add(@RequestBody Items item) {
        service.save(item);
    }
     
    // RESTful API method for Update operation
    @PutMapping("/items/{id}")
	public void update(@RequestBody Items item) {
		 service.update(item);
	}
    // RESTful API method for Delete operation
    @DeleteMapping("/items/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
    
   
}