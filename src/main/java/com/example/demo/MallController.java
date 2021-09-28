package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
 
import org.springframework.web.bind.annotation.*;

 
@RestController
public class MallController {
 
    @Autowired
    private MallService service;

    @GetMapping("/malls")
    public List<Mall> list() {
        return service.listAll();
    }
    @GetMapping("/malls/{id}")
    public ResponseEntity<Mall> get(@PathVariable Integer id) {
        try {
        	Mall mall = service.get(id);
            return new ResponseEntity<Mall>(mall, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Mall>(HttpStatus.NOT_FOUND);
        }      
    }

    @PostMapping("/malls")
    public void add(@RequestBody Mall mall) {
        service.save(mall);
    }
     
    @PutMapping("/malls/{id}")
	public void update(@RequestBody Mall mall) {
		 service.update(mall);
	}

    @DeleteMapping("/malls/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }  
}