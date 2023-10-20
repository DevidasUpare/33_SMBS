package com.tcs.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.binding.Book;

@RestController
public class BookRestController {

	
//	  @GetMapping("/book/{id}") public Book getBook(@PathVariable("id") Integer id)
//	  { Book b=new Book(id, "Java", 2500.00); return b; }
//	 
	@GetMapping(value="/book/{id}", produces="application/json")
	public ResponseEntity<Book> getBook(@PathVariable("id") Integer id) {
		Book b = new Book(id, "Java", 2500.00);

		return new ResponseEntity<>(b, HttpStatus.OK);
	}

	@GetMapping(value="/books", produces="application/json")
	public ResponseEntity<List<Book>> getBooks() {
		Book b1 = new Book(501, "Java", 2500.00);
		Book b2 = new Book(502, "Python", 500.00);
		Book b3 = new Book(503, "DevOps", 3000.00);

		List<Book> books = Arrays.asList(b1, b2, b3);
		return new ResponseEntity<>(books, HttpStatus.OK);

	}

	@PostMapping(value="/book", consumes="application/json", produces="text/plain")
	public ResponseEntity<String> saveBook(@RequestBody Book book) {
		System.out.println(book);

		return new ResponseEntity<>("Book save", HttpStatus.CREATED);
	}

	@PutMapping(value="/book/{id}", consumes="application/json", produces="application/json")
	public ResponseEntity<Book> updateBook(@PathVariable("id") Integer id, @RequestBody Book book) {
		System.out.println(book);
		return new ResponseEntity<>(book, HttpStatus.OK);
	}

	@DeleteMapping(value="/book/{id}", produces="text/plain")
	public ResponseEntity<String> deleteBook(@PathVariable("id") Integer id) {
		System.out.println("Id to delete record:: " + id);
		return new ResponseEntity<>("Record Deleted", HttpStatus.OK);
	}
}
