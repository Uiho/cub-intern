package org.foflo.cubin.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/cubin")
public class CubinResourceV1 {
	
	@RequestMapping(value = "/hello/{name}", produces = "application/json", method = RequestMethod.GET)
	public String HelloWorld(@PathVariable String name){
		return "Hello, "+name+"!";
	}

}
