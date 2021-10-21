package com.zensar.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.model.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

	
	//boolean searchBooksbyStudid(int studid);
	//boolean searchStudsbyBookid(int bookid); 
}
