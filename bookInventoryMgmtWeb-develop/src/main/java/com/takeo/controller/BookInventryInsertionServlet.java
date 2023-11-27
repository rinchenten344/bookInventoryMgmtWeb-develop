package com.takeo.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.takeo.model.Book;
import com.takeo.service.BookService;

public class BookInventryInsertionServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	String bName=	req.getParameter("bName");
	String price=	req.getParameter("price");
	String bDescription = req.getParameter("bDescription");
	String dateStr = req.getParameter("date");
	String availability = req.getParameter("availability");
	
BookService bookService=new BookService();
try {
Book book=new Book();
book.setBookName(bName);
book.setPrice(Double.parseDouble(price));
book.setBookDescription(bDescription);
book.setDate(Date.valueOf(dateStr));
book.setAvailability(availability);

bookService.addBook(book);

RequestDispatcher rd= req.getRequestDispatcher("/bookInventory.jsp");

req.setAttribute("insertRes", "success");
rd.forward(req, resp);
}catch (NumberFormatException e) {
	RequestDispatcher rd= req.getRequestDispatcher("/bookInventory.jsp");

	req.setAttribute("insertRes", "there is an issue in your requet pls corret it");
	rd.forward(req, resp);
}

		
		
	}

}
