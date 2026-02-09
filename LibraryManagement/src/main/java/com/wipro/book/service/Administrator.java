package com.wipro.book.service;

import com.wipro.book.bean.BookBean;
import com.wipro.book.dao.BookDAO;

public class Administrator {
    public String addBook(BookBean bookBean) {
    	 if (bookBean == null || bookBean.getBookName().isEmpty() ||
    			 (bookBean.getBookType() != 'G' && bookBean.getBookType() != 'T') || 
    	         bookBean.getCost() <= 0 || bookBean.getAuthor().getAuthorName().isEmpty()){
    	   
    	            return "INVALID";

    	        }
        int result = new BookDAO().createBook(bookBean);
        if (result == 1) {

            return "SUCCESS";

        } else {

            return "FAILURE";  
            }
        }
    
    public BookBean viewBook(String isbn) {
    	BookDAO bookDAO=new BookDAO();
    	BookBean bookBean=bookDAO.fetchBook(isbn);
    	return bookBean;
    	//return new BookDAO().fetchBook(isbn);	
    }
    
}