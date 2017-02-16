package com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the scenariodetails database table.
 * 
 */
@Entity
@Table(name="scenariodetails")
@NamedQuery(name="Scenariodetail.findAll", query="SELECT s FROM ScenarioDetail s")
public class ScenarioDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ScenariodetailPK id;

	private byte isActive;

	private String scenario;

	private int timer;

	public ScenarioDetail() {
	}

	public ScenariodetailPK getId() {
		return this.id;
	}

	public void setId(ScenariodetailPK id) {
		this.id = id;
	}

	public byte getIsActive() {
		return this.isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getScenario() {
		return this.scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public int getTimer() {
		return this.timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

}