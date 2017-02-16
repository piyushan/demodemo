package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the logindetails database table.
 * 
 */
@Entity
@Table(name="logindetails")
@NamedQuery(name="Logindetail.findAll", query="SELECT l FROM LoginDetail l")
public class LoginDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String userName;

	@Temporal(TemporalType.DATE)
	private Date creationDate;

	private String firstName;

	private byte isActive;

	private String lastName;

	private String password;

	private String role;

	public LoginDetail() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}