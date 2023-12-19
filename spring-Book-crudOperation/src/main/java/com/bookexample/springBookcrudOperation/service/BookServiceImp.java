package com.bookexample.springBookcrudOperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookexample.springBookcrudOperation.Model.Books;
import com.bookexample.springBookcrudOperation.repository.BookRepository;
@Component
public class BookServiceImp implements BookService {

	
	@Autowired
	private BookRepository bookRepository;
	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.getAllBooks();
	}

	
	public int creatBook(Books books) {
		// TODO Auto-generated method stub
		return bookRepository.createBook(books);
	}

	
	public Books getBookbyId(int bookid) {
		// TODO Auto-generated method stub
		return bookRepository.findBook(bookid);
	}


	public Integer updatBook(Books books) {
		// TODO Auto-generated method stub
		return bookRepository.updatebook(books);
	}

	
	public Integer deleteBook(int id) {
		// TODO Auto-generated method stub
		return bookRepository.deleteBook(id);
	}

}
