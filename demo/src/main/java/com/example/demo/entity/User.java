package com.example.demo.entity;



import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class User implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)  
		@Column(name="userid")
		private Long id;
		private String email;
		private String pwd;
		private String fname;
		private String lname;
		
		
		
		
		
		public User() {
			super();
		}
		public Long getId() {
			return id;
		}
		
		
		
		public User(Long id, String email, String pwd, String fname, String lname) {
			super();
			this.id = id;
			this.email = email;
			this.pwd = pwd;
			this.fname = fname;
			this.lname = lname;
		
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
	
		
		
		
		

	}


