package com.bookexample.springBookcrudOperation.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookexample.springBookcrudOperation.Model.Books;

@Repository
public class BookRepository 
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static String SELECT_QUERY ="SELECT * FROM BOOKDATA";
	
	private static String INSERT_QUERY="INSERT INTO BOOKDATA(BOOKID,BOOKNAME,BOOKAUTHOR,PRICE)VALUES(?,?,?,?)";
	
	private static String GETBOOK_QUERY="SELECT * FROM BOOKDATA WHERE BOOKID=?";
	
	private static String UPDATEBOOK_QUERY="UPDATE BOOKDATA SET BOOKNAME=?,BOOKAUTHOR=?,PRICE=? WHERE BOOKID=?";
	
	private static String DELETEBOOK_QUERY="DELETE FROM BOOKDATA WHERE BOOKID=?";
	
	
	public List<Books> getAllBooks()
	{
		return jdbcTemplate.query(SELECT_QUERY, new BeanPropertyRowMapper<>(Books.class));
	}
	
	public int createBook(Books books)
	{
		return jdbcTemplate.update(INSERT_QUERY, books.getBookid(),books.getBookname(),books.getBookauthor(),books.getPrice());
	}
	public Books findBook(int bookid)
	{
		return jdbcTemplate.queryForObject(GETBOOK_QUERY, new BeanPropertyRowMapper<>(Books.class),bookid);
	}
	
	public Integer updatebook(Books books)
	{
		return jdbcTemplate.update(UPDATEBOOK_QUERY, books.getBookname(),books.getBookauthor(),books.getPrice(),books.getBookid());
	}
	public Integer deleteBook(int bookid)
	{
		return jdbcTemplate.update(DELETEBOOK_QUERY, bookid);
	}

}
