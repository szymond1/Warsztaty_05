package pl.coderslab.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pl.coderslab.model.Book;
import pl.coderslab.bean.MemoryBookService;

@RestController
@RequestMapping("/books")
public class BookControler {
	
	@Autowired
	MemoryBookService mbs;
	Book book;
	
	@RequestMapping("/hello")
	public String hello() {
		return "{hello: World}";
	}
	
	@RequestMapping("/helloBook")
	public Book helloBook() {
		return new Book(1L,"9788h324631766","Thiniking in Java","Bruce faf","Helion","programming");
	}

	@GetMapping("/")
	public List<Book> showBooks() {
		return this.mbs.getList();
	}
	
	@GetMapping("/{id}")
	public Book showParticularBook(@PathVariable long id) {
		return this.mbs.getParticularBook(id);
	}
	
	@PostMapping("/books")
	
	public String addBook(@RequestParam Book b) {
		if (true) {
			// validate book b
			this.mbs.getList().add(b);
			return "{\"result\":\"success\"}";
		}
		return "{\"result\":\"failed\"}";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
