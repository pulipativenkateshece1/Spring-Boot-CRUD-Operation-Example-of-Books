package com.bookexample.springBookcrudOperation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookexample.springBookcrudOperation.Model.Books;
import com.bookexample.springBookcrudOperation.service.BookService;

@RestController
public class BookController 
{
	@Autowired
	
	private BookService bookService;
	
	@GetMapping("GetAllBooks")
	public List<Books> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	@PostMapping("CreatBook")
	public int creatBook(@RequestBody Books books)
	{
		return bookService.creatBook(books);
	}
	@GetMapping("findbook/{bookid}")
	public Books findbook(@PathVariable int bookid)
	{
		return bookService.getBookbyId(bookid);
	}
	@PostMapping("findbook")
	public Books findbook(@RequestBody Books books)
	{
		return bookService.getBookbyId(books.getBookid());
	}
	@PutMapping("updateBook")
	public Integer updatebook(@RequestBody Books books)
	{
		return bookService.updatBook(books);
		
	}
	@DeleteMapping("deleteBook/{bookid}")
	public Integer deleteBook(@PathVariable int  bookid)
	{
		return bookService.deleteBook(bookid);
	}

}
