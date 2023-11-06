package com.studentAttendance.userModel;


public class UserModel {
	
	private String name;
	private String surname;
	private String id;
	private String number;
	private String email;
	private String password;
	private String user_device;
	private String position;
	private byte[] picture;
	
	UserModel(){
		
	}
	
	UserModel(String name, String surname, String id, String number, String email, String password, String user_device, String position, byte[] picture){
		this.setName(name);
		this.setSurname(surname);
		this.setId(id);
		this.setNumber(number);
		this.setEmail(email);
		this.setPassword(password);
		this.setUser_device(user_device);
		this.setPosition(position);
		this.setPicture(picture);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public String getUser_device() {
		return user_device;
	}

	public void setUser_device(String user_device) {
		this.user_device = user_device;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

}
