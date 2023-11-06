package com.studentAttendance.userModel;

import org.springframework.web.multipart.MultipartFile;

public class File {
	
	private MultipartFile picture;
	
	File(){
	}
	
	File(MultipartFile picture){
		this.setPicture(picture);
	}

	public MultipartFile getPicture() {
		return picture;
	}

	public void setPicture(MultipartFile picture) {
		this.picture = picture;
	}
}
