package com.tcs.db2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOOK_TBL")
public class Book {

	@Id
	@GeneratedValue
	private Integer id;
	private String bookName;
	private Double bookPrice;

	public Book(int i, String string, double d) {
		
	}
	
	

	public Book(Integer id, String bookName, Double bookPrice) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	

}
