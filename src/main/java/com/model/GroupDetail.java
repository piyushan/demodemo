package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the groupdetails database table.
 * 
 */
@Entity
@Table(name="groupdetails")
@NamedQuery(name="Groupdetail.findAll", query="SELECT g FROM GroupDetail g")
public class GroupDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int srno;

	private String groupName;

	private byte isActive;

	private String userName;

	public GroupDetail() {
	}

	public int getSrno() {
		return this.srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}