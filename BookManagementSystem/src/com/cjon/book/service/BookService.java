package com.cjon.book.service;

import com.cjon.book.dao.BookDAO;

public class BookService {

	// 리스트를 가져오는 일을 하는 method
	public String getList(String keyword) {
		// 일반적인 로직처리 나와요!!
		
		// 추가적으로 DB처리가 나올 수 있어요!
		// DB처리는 Service에서 처리는하는게 아니라..다른 객체를 이용해서
		// Database처리를 하게 되죠!!
		BookDAO dao = new BookDAO();
		String result = dao.select(keyword);	
		
		return result;
	}

	public boolean updateBook(String isbn, String title, String author, String price) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();
		boolean result = dao.update(isbn, title, author, price);	
		return result;
	}
	public boolean deleteBook(String isbn) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();
		boolean result = dao.delete(isbn);	
		return result;
	}
	public String aboutBook(String isbn) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();
		String result = dao.about(isbn);	
		return result;
	}
	public boolean insertBook(String isbn, String title, String date, String page,  String price, String author, String translator, String supplement, String publisher, String imgurl, String imgbase64) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();
	
		boolean result = dao.insert(isbn,title,date,page,price,author,translator,supplement,publisher,imgurl,imgbase64);	
		return result;
	}
	public boolean newUser(String ID,String fname,String lname,String email,String pw) {
		// TODO Auto-generated method stub
		BookDAO dao = new BookDAO();
	
		boolean result = dao.newUser(ID,fname,lname,email,pw);	
		return result;
	}
	public String userLogin(String ID, String pw) {
		// 일반적인 로직처리 나와요!!
		
		// 추가적으로 DB처리가 나올 수 있어요!
		// DB처리는 Service에서 처리는하는게 아니라..다른 객체를 이용해서
		// Database처리를 하게 되죠!!
		BookDAO dao = new BookDAO();
		String result = dao.userLogin(ID, pw);	
		System.out.println(ID + pw +"서비스");

		
		return result;
	}
}












