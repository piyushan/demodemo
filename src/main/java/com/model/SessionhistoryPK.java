package com.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sessionhistory database table.
 * 
 */
@Embeddable
public class SessionhistoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String groupName;

	@Column(insertable=false, updatable=false)
	private int sessionId;

	public SessionhistoryPK() {
	}
	public String getGroupName() {
		return this.groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getSessionId() {
		return this.sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SessionhistoryPK)) {
			return false;
		}
		SessionhistoryPK castOther = (SessionhistoryPK)other;
		return 
			this.groupName.equals(castOther.groupName)
			&& (this.sessionId == castOther.sessionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.groupName.hashCode();
		hash = hash * prime + this.sessionId;
		
		return hash;
	}
}