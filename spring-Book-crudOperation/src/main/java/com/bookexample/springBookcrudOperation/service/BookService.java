package com.bookexample.springBookcrudOperation.service;

import java.util.List;

import com.bookexample.springBookcrudOperation.Model.Books;

public interface BookService
{
	List<Books> getAllBooks();
	
	int creatBook(Books books);
	
	Books getBookbyId(int bookid);
	
	Integer updatBook(Books books);
	
	Integer deleteBook(int id);
	
	

}
