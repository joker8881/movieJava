package com.example.movie.entity;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyinfo")
public class BuyInfo {
	
	@Id
	@Column(name = "number")
	private int number;
	
	@Column(name = "account")
	private String account;
	
	@Column(name = "movie")
	private String movie;
	
	@Column(name = "cinema")
	private String cinema;
	
	@Column(name = "area")
	private String area;

	@Column(name = "price")
	private int price;
	
	@Column(name = "on_date")
	private LocalDate date;
	
	@Column(name = "on_time")
	private String onTime;
	
	@Column(name = "seat")
	private String seat;

	public BuyInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public BuyInfo(String seat) {
		super();
		this.seat = seat;
	}



	public BuyInfo(int number, String account, String cinema, String area, String movie, int price, LocalDate date,
			String onTime, String seat) {
		super();
		this.number = number;
		this.account = account;
		this.cinema = cinema;
		this.area = area;
		this.movie = movie;
		this.price = price;
		this.date = date;
		this.onTime = onTime;
		this.seat = seat;
	}
	
	public BuyInfo(String account, String movie, String cinema, String area, int price, LocalDate date,
			String onTime, String seat) {
		super();
		this.account = account;
		this.cinema = cinema;
		this.area = area;
		this.movie = movie;
		this.price = price;
		this.date = date;
		this.onTime = onTime;
		this.seat = seat;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getCinema() {
		return cinema;
	}

	public void setCinema(String cinema) {
		this.cinema = cinema;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getOnTime() {
		return onTime;
	}

	public void setOnTime(String onTime) {
		this.onTime = onTime;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	
	
}