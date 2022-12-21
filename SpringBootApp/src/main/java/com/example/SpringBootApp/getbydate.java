package com.example.SpringBootApp;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/getbydate/{date}")
public class getbydate {
	@Autowired UserRepo ob;
	@GetMapping()
	    public List<User> getAllNotes(@PathVariable("date") String date)
	    {

	        return ob.findbydate(date);

	        
	    }
}
