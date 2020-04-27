package com.sunsoft.service;

import com.sunsoft.bean.Author;

public interface AuthorService {
	public boolean addAuthor(Author author);
	public Author updateAuthor(Author author);
	public boolean deleteAuthor(Integer id);
}

