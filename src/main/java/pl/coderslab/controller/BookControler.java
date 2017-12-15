package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookControler {

	
	@RequestMapping("/hello")
	public String hello() {
		return "{hello: World}";
	}
}
