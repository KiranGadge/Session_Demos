package com.zensar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.zensar.dao.BookDao;
import com.zensar.model.Book;

public class BookController {

	@Autowired
	private BookDao bdao;
	
	@GetMapping(value="/")
	public String getAllBooks(Model m)
	{
		List<Book> blist=bdao.findAll();
		m.addAttribute("booklist",blist);
		return "Booklist";
	}
	
	@GetMapping(value="/addBook")
	public String insertBook(@ModelAttribute("add") Book book)
	{
		bdao.save(book);
		return "redirect:/";
		
	}
	
	public String updateBook(@ModelAttribute("update") Book b)
	{
		bdao.save(b);
		return "redirect:/";
	}
	
	public String deleteBook(@ModelAttribute("delete") int bookid)
	{
		bdao.deleteById(bookid);
		return "redirect:/";
		
	}
	
	
	
}
