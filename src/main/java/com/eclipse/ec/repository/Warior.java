package com.eclipse.ec.repository;

import com.eclipse.ec.enums.Places;
import com.eclipse.ec.enums.Wapens;
import com.eclipse.ec.services.exceptions.ToShortWarriorNameException;

public class Warior extends Character {

	private Places visitedPlace;
	private Wapens wapen;

	public Wapens getWapen() {
		return wapen;
	}

	public void setWapen(Wapens wapen) {
		this.wapen = wapen;
	}

	public Places getVisitedPlace() {
		return visitedPlace;
	}

	public void setVisitedPlace(Places visitedPlace) {
		this.visitedPlace = visitedPlace;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			throw new ToShortWarriorNameException();
		}
		super.setName(name);
	}

	public void setVisitedPlace(String visitedPlace) {
		this.visitedPlace = Places.valueOf(visitedPlace);
	}
	public String getVisitedPlaceAsString() {
		return visitedPlace.name();
	}

	@Override
	public String toString() {
		return "Warior [visitedPlace=" + visitedPlace + ", wapen=" + wapen + ", getWapen()=" + getWapen()
				+ ", getVisitedPlace()=" + getVisitedPlace() + ", getVisitedPlaceAsString()="
				+ getVisitedPlaceAsString() + ", getHitPoints()=" + getHitPoints() + ", getInitiative()="
				+ getInitiative() + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
