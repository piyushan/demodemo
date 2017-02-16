package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sessionhistory database table.
 * 
 */
@Entity
@NamedQuery(name="Sessionhistory.findAll", query="SELECT s FROM SessionHistory s")
public class SessionHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SessionhistoryPK id;

	private String logger;

	public SessionHistory() {
	}

	public SessionhistoryPK getId() {
		return this.id;
	}

	public void setId(SessionhistoryPK id) {
		this.id = id;
	}

	public String getLogger() {
		return this.logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

}