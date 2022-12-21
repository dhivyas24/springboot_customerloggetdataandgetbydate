package com.example.SpringBootApp;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/getAll")
public class getalldata {
	@Autowired UserRepo ob;
	@GetMapping()
	    public List<User> getAllNotes()
	    {

	        return ob.findAll();

	        
	    }
}
