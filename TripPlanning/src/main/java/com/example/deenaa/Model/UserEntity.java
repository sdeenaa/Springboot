package com.example.deenaa.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserTable")

public class UserEntity {
	
	@Id
	@GeneratedValue

	private int userId;
	private String userName;
	private String source;
	private String destination;
	private LocalDate start_date;
	private LocalDate end_date;
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserEntity(int userId, String userName, String source, String destination, LocalDate start_date,
			LocalDate end_date) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.source = source;
		this.destination = destination;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getStart_date() {
		return start_date;
	}
	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public LocalDate getEnd_date() {
		return end_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	
}
