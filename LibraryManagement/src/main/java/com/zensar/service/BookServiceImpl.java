package com.zensar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.dao.BookDao;
import com.zensar.model.Book;

@Service
public class BookServiceImpl {

	@Autowired
	private BookDao bdao;
	
	/*
	 * public Book getBook(int bookid) { // TODO Auto-generated method stub return
	 * bdao.getById(bookid); }
	 */
	
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bdao.findAll();
	}

	
	public Book insertBook(Book book) {
		// TODO Auto-generated method stub
		return bdao.save(book);
	}

		public Book updateBook(Book b) {
		// TODO Auto-generated method stub
		return bdao.save(b);
	}

	
	public void deleteBook(int bookid) {
		// TODO Auto-generated method stub
		 bdao.deleteById(bookid);
	}

}
