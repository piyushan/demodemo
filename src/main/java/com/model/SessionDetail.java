package com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the sessiondetails database table.
 * 
 */
@Entity
@Table(name="sessiondetails")
@NamedQuery(name="Sessiondetail.findAll", query="SELECT s FROM SessionDetail s")
public class SessionDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int sessionId;

	private Time endTime;

	private byte isActive;

	@Temporal(TemporalType.DATE)
	private Date sessionDate;

	private String sessionName;

	private Time startTime;

	private String userName;

	public SessionDetail() {
	}

	public int getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public Time getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public Date getSessionDate() {
		return this.sessionDate;
	}

	public void setSessionDate(Date sessionDate) {
		this.sessionDate = sessionDate;
	}

	public String getSessionName() {
		return this.sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public Time getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}