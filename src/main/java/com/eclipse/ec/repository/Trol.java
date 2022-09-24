package com.eclipse.ec.repository;

import com.eclipse.ec.domain.ForestCharacter;
import com.eclipse.ec.domain.MountainsCharacter;

public class Trol extends Character implements MountainsCharacter {
	private int damageBySun;

	public int getDamageBySun() {
		return damageBySun;
	}

	public void setDamageBySun(int damageBySun) {
		this.damageBySun = damageBySun;
	}

	@Override
	public String toString() {
		return "Trol [damageBySun=" + damageBySun + "]";
	}



}
