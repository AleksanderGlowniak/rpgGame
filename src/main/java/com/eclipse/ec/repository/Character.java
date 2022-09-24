package com.eclipse.ec.repository;

import java.util.Objects;

public class Character implements Comparable<Character> {
	private int hitPoints;
	private int initiative;
	private String name;
	public Character() {
		hitPoints = 2;
		initiative = 0;
		name = "NN";
	}
	public Character(int hitPoints, int initiative, String name) {
		this.hitPoints = hitPoints;
		this.initiative = initiative;
		this.name  = name;
	}

	public void setHitPoints(int newHitPoints) {
		hitPoints = newHitPoints;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setInitiative(int newInitiative) {
		initiative = newInitiative;
	}
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(String newInitiative) {
		initiative = Integer.valueOf(newInitiative);
	}
	public void setInitiative() {
		initiative = 5;
	}
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}

	
	@Override
	public String toString() {
		return "Character [hitPoints=" + hitPoints + ", initiative=" + initiative + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Character a) {
		if (this.initiative< a.initiative) return 1;
		if (this.initiative> a.initiative) return -1;
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hitPoints, initiative, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		return hitPoints == other.hitPoints && initiative == other.initiative && Objects.equals(name, other.name);
	}
	
}
