package com.sunsoft.service;

import com.sunsoft.bean.Author;
import com.sunsoft.DAO.AuthorDAOImpl;



public class AuthorServiceImpl implements AuthorService{

	AuthorDAOImpl dao = new AuthorDAOImpl();

		
		
	
	public boolean addAuthor(Author author) {
		return dao.addAuthor(author);
	}

	
	public Author updateAuthor(Author author) {
		return dao.updateAuthor(author);
	}

	
	
	
	public boolean deleteAuthor(Integer id) {
		return dao.deleteAuthor(dao.findAuthor(id));
	}
	
	
	public Author findAuthor(Integer id) {
		return dao.findAuthor(id); 
	}

}

