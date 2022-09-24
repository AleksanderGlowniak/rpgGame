package com.eclipse.ec.repository;

import java.util.Objects;

import com.eclipse.ec.domain.ForestCharacter;

public class Zomby extends Character implements ForestCharacter {
	private int damageBySun;

	public int getDamageBySun() {
		return damageBySun;
	}

	public void setDamageBySun(int damageBySun) {
		this.damageBySun = damageBySun;
	}


	@Override
	public String toString() {
		return "Zomby [damageBySun=" + damageBySun + " characterparameter = " + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(damageBySun);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zomby other = (Zomby) obj;
		return damageBySun == other.damageBySun;
	}


}
