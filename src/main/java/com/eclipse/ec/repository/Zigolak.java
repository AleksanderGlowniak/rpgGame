package com.eclipse.ec.repository;

import java.util.Objects;

import com.eclipse.ec.repository.Character;
import com.eclipse.ec.domain.ForestCharacter;
import com.eclipse.ec.domain.MountainsCharacter;

public class Zigolak extends Character {
	private int damageBySun;

	public int getDamageBySun() {
		return damageBySun;
	}

	public void setDamageBySun(int damageBySun) {
		this.damageBySun = damageBySun;
	}

	@Override
	public String toString() {
		return "Zigolak [damageBySun=" + damageBySun + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(damageBySun);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zigolak other = (Zigolak) obj;
		return damageBySun == other.damageBySun;
	}

}
