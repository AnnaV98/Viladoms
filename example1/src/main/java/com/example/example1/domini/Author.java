package com.example.example1.domini;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity 
public class Author {
	
	@Id
	@GeneratedValue
	@NotNull
//	@Size(min=0, max=10)
	public int id;
	@NotEmpty
//	@Min(2)
	public String name;
	@NotEmpty
	public String country;
	@NotNull
	public int dob;
	@NotNull
	@Max(999)
	public int qtyBooks;
	@NotNull
	public Boolean alive;
	
	

	@ManyToMany (cascade=CascadeType.ALL,
			fetch=FetchType.EAGER)
	@JoinTable(name="AUTHOR_BOOK",
			joinColumns= {@JoinColumn(name="FK_AUTHOR")},
			inverseJoinColumns={@JoinColumn(name="FK_BOOK")})

	public List<Book> books = new ArrayList<Book>();		


	public Author () {}


	public Author (int id, String name, String country, int dob,int qtyBooks, Boolean alive) {
		//super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.dob = dob;
		this.qtyBooks = qtyBooks;
		this.alive = alive;
	}

	public Author (String name, String country, int dob,int qtyBooks, Boolean alive) {
		//super();
		this.name = name;
		this.country = country;
		this.dob = dob;
		this.qtyBooks = qtyBooks;
		this.alive = alive;
	}





	public List<Book> getBooks() {
		return books;
	}		
	
	public void addBook (Book book) {
		this.books.add(book);
		book.addAuthor(this);
	}
	



	public void setBooks(List<Book> books) {
		this.books = books;
	}


	int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public int getQtyBooks() {
		return qtyBooks;
	}
	public void setQtyBooks(int qtyBooks) {
		this.qtyBooks = qtyBooks;
	}
	public Boolean getAlive() {
		return alive;
	}
	public void setAlive(Boolean alive) {
		this.alive = alive;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", country=" + country + ", dob=" + dob + ", qtyBooks="
				+ qtyBooks + ", alive=" + alive + "]";
	}
}
