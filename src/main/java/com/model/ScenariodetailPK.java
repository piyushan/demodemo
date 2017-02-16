package com.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the scenariodetails database table.
 * 
 */
@Embeddable
public class ScenariodetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int scenarioId;

	@Column(insertable=false, updatable=false)
	private int sessionId;

	public ScenariodetailPK() {
	}
	public int getScenarioId() {
		return this.scenarioId;
	}
	public void setScenarioId(int scenarioId) {
		this.scenarioId = scenarioId;
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
		if (!(other instanceof ScenariodetailPK)) {
			return false;
		}
		ScenariodetailPK castOther = (ScenariodetailPK)other;
		return 
			(this.scenarioId == castOther.scenarioId)
			&& (this.sessionId == castOther.sessionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.scenarioId;
		hash = hash * prime + this.sessionId;
		
		return hash;
	}
}